import java.util.Scanner;

public class DisplayEvenOddReadNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an integer bigger than 1:");
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        System.out.println("Identifying numbers from **1 to " + x+" ***");
        for (int i = 1; i <= x; ++i) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }
    }
}
