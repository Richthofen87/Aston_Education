package homework3.task3_3;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result;
        for (int i = 0; i < 3; i++) {
            result = true;
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            OUTER: for (int j = 0; j < chars.length - 1; j++) {
                for (int k = j + 1; k < chars.length;) {
                    if (chars[j] == chars[k++]) {
                        result = false;
                        break OUTER;
                    }
                }
            }
            if (result) {
                System.out.println(str);
                break;
            }
        }
        scanner.close();
    }
}
