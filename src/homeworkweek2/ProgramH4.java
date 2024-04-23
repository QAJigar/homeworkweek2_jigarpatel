package homeworkweek2;

/**Write a Java programme using the following steps.
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
 *
 */

public class ProgramH4 {


        int s = 18;
        int k = 10;
        static boolean x = true;
        static boolean y = false;

        public void j1(){
            System.out.println(s);
            System.out.println(k);
            System.out.println(ProgramH4.x);
            System.out.println(ProgramH4.y);
        }

        public static void s1(){
            ProgramH4 obj = new ProgramH4();
            System.out.println(obj.s);
            System.out.println(obj.k);
            System.out.println(y);
            System.out.println(x);
        }

        public static void main(String[] args) {
            ProgramH4 obj = new ProgramH4();
            obj.j1();
            s1();
        }
    }

