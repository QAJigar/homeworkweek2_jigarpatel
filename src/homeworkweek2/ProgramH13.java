package homeworkweek2;

import java.util.Scanner;

/**
 *  Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class ProgramH13 {

    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number:  ");
        System.out.println("Enter two number:  ");
        System.out.println("Enter three number:  ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double average = ( num1 + num2 + num3) / 3.0;
        System.out.println("Average of the three number:" + average);
    }

    public static void main(String[] args) {
        prime();
    }
}
