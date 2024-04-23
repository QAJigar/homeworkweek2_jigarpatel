package homeworkweek2;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class ProgramH10 {

    public static void sada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int val = sc.nextInt();
        System.out.println(val + " * 1 " + " = " + val * 1);
        System.out.println(val + " * 2 " + " = " + val * 2);
        System.out.println(val + " * 3 " + " = " + val * 3);
        System.out.println(val + " * 4 " + " = " + val * 4);
        System.out.println(val + " * 5 " + " = " + val * 5);
        System.out.println(val + " * 6 " + " = " + val * 6);
        System.out.println(val + " * 7 " + " = " + val * 7);
        System.out.println(val + " * 8 " + " = " + val * 8);
        System.out.println(val + " * 9 " + " = " + val * 9);
        System.out.println(val + " * 10 " + " = " + val * 10);

    }

    public static void main(String[] args) {
     sada();
    }

}
