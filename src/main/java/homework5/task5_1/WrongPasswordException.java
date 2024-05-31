package homework5.task5_1;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("""
                Длина поля "password" должна быть меньше 20 символов,\
                 не должна содержать пробелы\
                 и должна содержать хотя бы одну цифру\
                """);
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
