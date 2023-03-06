import java.util.Scanner;

public class GuessSum {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = keyboard.nextInt();
        System.out.println("Please enter the second number:");
        num2 = keyboard.nextInt();
        System.out.println("Please enter the sum:");
        sum = keyboard.nextInt();
        int actualSum = num1 + num2;
        if(sum == actualSum){
            System.out.println("Congratulations! You guessed correctly");
        }else {
            System.out.println("Sorry! You guessed incorrectly");
        }
    }
}