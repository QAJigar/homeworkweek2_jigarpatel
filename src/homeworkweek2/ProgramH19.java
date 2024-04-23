package homeworkweek2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class ProgramH19 {

    public static void main(String[] args) {
prime19();
    }

    public static void prime19(){

        Scanner in = new Scanner(System.in);
        System.out.println("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
