package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.6 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class ProgramH14 {
static double width, height;
    public static void main(String[] args) {
        prime14();

    }

    public static void prime14(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width:    ");
        width = scanner.nextDouble();

        System.out.println("Enter height: ");
        height = scanner.nextDouble();

        double area = width * height;
        double parameter = (width + height) * 2;
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + parameter);


        }

    }

