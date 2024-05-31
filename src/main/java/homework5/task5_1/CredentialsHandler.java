package homework5.task5_1;

public class CredentialsHandler {
    public static boolean handle(String login, String password, String confirmPassword) {
        boolean isValid = false;
        try {
            checkCredentials(login, password, confirmPassword);
            isValid = true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
        return isValid;
    }

    private static void checkCredentials(String login, String password,
                                         String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() >= 20 || login.contains(" ")) throw new WrongLoginException();
        if (password == null || password.length() >= 20 || password.contains(" ")
                || !password.matches(".*\\d+.*")) throw new WrongPasswordException();
        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Поля \"password\" и \"confirmPassword\" должны быть равны");
    }
}
