package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class ProgramH17 {

    public static void jig17() {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        dec_num = scan.nextInt();
        quot = dec_num;
        while (quot !=0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.println("Binary number is: ");
        for (j = i - 1; j > 0; j--){
            System.out.println(bin_num[j]);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        jig17();
    }


    }

