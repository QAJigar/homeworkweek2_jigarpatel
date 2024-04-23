package homeworkweek2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class ProgramH7 {

    public static void prime2() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter temperature value in Fahrenheit: ");
        double f = obj.nextDouble();
        double c = (f-32) * 5/9;
        System.out.print(" converted to Celsius: "  + c +"°C" );


    }

    public static void main(String[] args){
        prime2();
    }
}