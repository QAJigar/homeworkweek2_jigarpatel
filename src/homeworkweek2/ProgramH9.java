package homeworkweek2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class ProgramH9 {

    public static void main(String[] args) {
swami();

    }

    public static void swami(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any latter in upper case: ");
        String up = scanner.next();
        String lc = up.toLowerCase(Locale.ROOT);
        System.out.println("lowe case " + lc);
    }
}

