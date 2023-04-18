import java.util.Scanner;

public class DisplayStarsMultipleGo {
    public static void main(String[] args) {
        char response;
        do {
            Scanner keyboard = new Scanner(System.in);
            // prompt and get user response
            System.out.println("Size of square?");
            int num = keyboard.nextInt();
            while (num < 2 || num > 20) {
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
            System.out.println("Do you want another go (y/n)?");
            response = keyboard.next().charAt(0);
        }while (response =='y' || response =='Y');
    }
}
