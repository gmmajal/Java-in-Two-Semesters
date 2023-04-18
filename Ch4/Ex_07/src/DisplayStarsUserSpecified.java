import java.util.Scanner;

public class DisplayStarsUserSpecified {
    public static void main(String[] args) {
        int num; // to hold user response
        Scanner keyboard = new Scanner(System.in);
        // prompt and get user response
        System.out.println("Size of square?");
        num = keyboard.nextInt();
        while(num<2 || num>20){
               System.out.println("Error! The size should be between 2 and 20:");
               num = keyboard.nextInt();
        }
        // display square
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}