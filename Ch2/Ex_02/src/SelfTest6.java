import java.util.Scanner;
public class SelfTest6 {
    public static void main(String[] args){
        // The expected output should be 2 if the user enters 10

        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        num2 = 6;
        System.out.print("Enter value ");
        num1 = keyboard.nextInt();
        num1 = num1 + 2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);
    }
}
