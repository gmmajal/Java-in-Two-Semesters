import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        num1 = keyboard.nextInt();
        System.out.println("Please enter the second number:");
        num2 = keyboard.nextInt();
        if (num1 ==  num2){
            System.out.println("NUMBERS ARE EQUAL");
        }
        else if (num1 > num2){
            System.out.println("FIRST NUMBER IS BIGGER");
        }
        else{
            System.out.println("SECOND NUMBER IS BIGGER");
        }
    }
}