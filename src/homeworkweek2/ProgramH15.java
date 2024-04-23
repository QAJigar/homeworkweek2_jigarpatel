package homeworkweek2;

/**
 * Write a Java program to swap two variables.
 */
public class ProgramH15 {

    public static void main(String[] args) {
    swap();

    }

        public static void swap() {

            int x = 17, y = 80;

            System.out.println("Before Swap");
            System.out.println("x = " + x);
            System.out.println("y = " + y);

            // Swapping using three
            // Variables

            int temp = x;
            x = y;
            y = temp;

            System.out.println("After swap");
            System.out.println("x = " + x);
            System.out.println("y = " + y);


    }

}

