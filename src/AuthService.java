import java.util.concurrent.ThreadLocalRandom;

public class AuthService {

    private final static Checker CHECKER = ThreadLocalRandom.current().nextBoolean() ? new LoopChecker() : new RegexpChecker();
    public static boolean validate(String login,
                                String password,
                                String confirmPassword) {
        try {
            CHECKER.check(login, password, confirmPassword);
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.printf("%s: %s%n", e.getClass(), e.getMessage());
            return false;
        }
        return true;
    }
}
