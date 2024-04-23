package homeworkweek2;
import java.util.Scanner;
/**
 * Write a Java program to add two binary numbers.
 * Input Data:Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:Sum of two binary numbers: 101
 */
public class ProgramH16 {
    public static void main(String[] args) {
prime16();

    }

    public static void prime16(){
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
    if (remainder != 0) {
        sum[i++] = remainder;
    }
    --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");

    }


}
