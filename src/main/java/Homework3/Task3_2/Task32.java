package Homework3.Task3_2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        int middleLength = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
            middleLength += array[i].length();
            if (i == 2) middleLength /= 3;
        }
        for (String s : array) {
            if (s.length() < middleLength)
                System.out.println(s + " -> " + s.length());
            scanner.close();
        }
    }
}
