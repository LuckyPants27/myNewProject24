public class LoopChecker implements Checker{

    @Override
    public void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLength(login, true);
        checkLength(password, false);
        checkCharacters(login, true);
        checkCharacters(password, false);
        checkPassword(password, confirmPassword);
    }

    private void checkCharacters(String s, boolean login) throws WrongLoginException, WrongPasswordException  {
        if(s == null) {
            throwException(login, "null");
        }
        char[] chars = s.toCharArray();
        String validCharacters = "abcdefghijklmonpqrstuvwxyzABCDEFGHIJKLMONPQRSTUVWXYZ0123456789_";
        for (char aChar : chars) {
            if (validCharacters.contains(Character.toString(aChar))) {
                continue;
            }
            throwException(login, "Некорректный символ");
        }
    }

    private void checkLength(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (s != null && s.length() <= 20) {
            return;
        }
        throwException(login, "Некорректная длина");
    }
}
