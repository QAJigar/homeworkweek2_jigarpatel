package homeworkweek2;
/** Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class ProgramH3 {

    int s = 18;
    static boolean x = true;

    public void j1(){
        System.out.println(s);
        System.out.println(ProgramH3.x);
    }

    public static void s1(){
        ProgramH3 obj = new ProgramH3();
        System.out.println(obj.s);
        System.out.println(x);
    }

    public static void main(String[] args) {
        ProgramH3 obj = new ProgramH3();
        obj.j1();
        s1();
    }
}
