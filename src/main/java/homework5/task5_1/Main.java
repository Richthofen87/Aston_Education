package homework5.task5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login:");
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Please confirm password:");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        boolean isUserCredentialsValid = CredentialsHandler.handle(login, password, confirmPassword);
        if (isUserCredentialsValid) System.out.println("\nCongrats! Your credentials are valid!");
    }
}
