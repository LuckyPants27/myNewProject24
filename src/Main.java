public class Main {
    public static void main(String[] args) {
        String login = "grishenkov";
        String password = "123456";
        String confirmPassword = "123456";
        boolean success = AuthService.validate(login, password, confirmPassword);
        if (success) {
            System.out.println("Проверка пройдена успешно");
        }else {
            System.out.println("Проверка не пройдена");
        }
    }
}