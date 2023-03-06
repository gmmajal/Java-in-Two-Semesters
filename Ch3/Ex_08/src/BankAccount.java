import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        double amount,interestEarned=0.0;
        char accountType;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the amount in your account:");
        amount = keyboard.nextDouble();
        System.out.println("Please enter the acount type (A,B,C,X):");
        accountType = keyboard.next().charAt(0);
        switch (accountType){
            case 'A', 'C':  interestEarned = 0.015*amount;
                            break;
            case 'B':   interestEarned = 0.02*amount;
                        break;
            case 'X':   interestEarned = 0.05*amount;
                        break;
            default:    System.out.println("No such account type exists");
                        break;
        }
        System.out.println("The amount of interest earned will be "+ interestEarned);
    }
}