package homework6.task6_1;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("""
                Длина поля "login" должна быть меньше 20 символов\
                 и не должна содержать пробелы\
                """);
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
