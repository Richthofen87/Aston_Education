package homework6.task6_2;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input something...");
        writeString(scanner.nextLine());
        System.out.println("You entered: \"" + readString().replaceAll(" ", "_") + "\"");
        scanner.close();
    }

    private static void writeString(String str) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("tms.txt")) {
            fileOutputStream.write(str.getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String readString() {
        try (FileInputStream fileInputStream = new FileInputStream("tms.txt")) {
            return new String(fileInputStream.readAllBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
