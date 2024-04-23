package homeworkweek2;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class ProgramH8 {

    public static void primeX() {
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter the base length of the triangle");
        double base = obj.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height = obj.nextDouble();
        double area = (height*base)/2;
        System.out.println("The area of the triangle is: " + base + " and " + height + " = " + area);
    }

    public static void main(String[] args) {
        primeX();
    }
}
