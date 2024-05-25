package Homework3.Task3_4;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) stringBuilder.append(c).append(c);
        System.out.println(stringBuilder);
        scanner.close();
    }
}
