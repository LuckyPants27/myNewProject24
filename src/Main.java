public class Main {
    public static void main(String[] args) {
        String login = "grishenkov";
        String password = "123456";
        String confirmPassword = "123456";
        try {
            AuthService.validate(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.printf("%s: %s%n", e.getClass(), e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.printf("%s: %s%n", e.getClass(), e.getMessage());
        }
    }
}