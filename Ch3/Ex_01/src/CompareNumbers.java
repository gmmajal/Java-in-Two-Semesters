import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Please enter the first number:");
        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        System.out.println("Please enter the second number:");
        num2 = keyboard.nextInt();

        if (num1 == num2){
            System.out.println("NUMBERS ARE EQUAL");
        }else{
            System.out.println("NUMBERS ARE NOT EQUAL");
        }
    }
}