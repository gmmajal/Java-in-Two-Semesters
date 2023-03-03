import java.util.Scanner;
public class SelfTest8 {
    public static void main(String [] args){
        // declare variables
        int x,y,temp; // new temporary variable added in order to swap variables
        Scanner keyboard = new Scanner(System.in); // instance of Scanner class needs to be made in order to read the user specified value.
        //enter values
        System.out.print("Enter value for x ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y ");
        y = keyboard.nextInt();

        // code attempting to swap two variables
        temp = x;
        x = y;
        y = temp;
        //display results
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
