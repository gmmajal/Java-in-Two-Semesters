import java.util.Scanner;
public class SelfTest4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int YEAR;
        int age, bornIn;
        System.out.println("How old are you this year?");
        age = keyboard.nextInt(); //original code: age = keyboard.nextDouble();

        /*lines 11 and 12 have been added to the original code*/
        System.out.println("What is the current year?");
        YEAR = keyboard.nextInt();
        bornIn = YEAR - age;
        //original code: System.out.println("I think you were born in " + BornIn);
        System.out.println("I think you were born in " + bornIn);

    }
}