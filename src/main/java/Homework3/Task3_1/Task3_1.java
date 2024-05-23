package Homework3.Task3_1;

import java.util.Scanner;

public class Task3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String minStr = "";
        String maxStr = "";
        for (int i = 0; i < 3; i++) {
            String curr = scanner.nextLine();
            if (i == 0) minStr = maxStr = curr;
            else if (curr.length() < minStr.length()) minStr = curr;
            else if (curr.length() > maxStr.length()) maxStr = curr;
        }
        System.out.printf("The shortest string is \"%s\", the longest string is \"%s\"", minStr, maxStr);
        scanner.close();
    }
}
