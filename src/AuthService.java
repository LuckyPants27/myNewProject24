public class AuthService {

    private final static Checker CHECKER = new LoopChecker();
    public static void validate(String login,
                                String password,
                                String confirmPassword) throws WrongLoginException, WrongPasswordException {
            CHECKER.check(login, password, confirmPassword);
    }
}
