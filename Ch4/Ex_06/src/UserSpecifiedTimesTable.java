import java.util.Scanner;
public class UserSpecifiedTimesTable {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        System.out.println("Printing the "+ x + " times table");
        for(int j=1;j<13;++j){
            System.out.println(j + " X "+ x + " = " + j*x);
        }
    }
}
