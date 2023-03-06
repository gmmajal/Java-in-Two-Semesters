import java.util.Scanner;
public class BankAccountAmount {
    public static void main(String[] args) {
        double amount,interestEarned=0.0;
        char accountType;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the amount in your account:");
        amount = keyboard.nextDouble();
        System.out.println("Please enter the account type (A,B,C,X):");
        accountType = keyboard.next().charAt(0);
        switch (accountType){
            case 'A','C':
                if(amount<250){
                    System.out.println("The balance in your account is below the minimum value needed to earn interest");
                }else{
                    interestEarned = amount * 0.015;
                }
                break;
            case 'B':
                if(amount<1000){
                    System.out.println("The balance in your account is below the minimum value needed to earn interest");
                }else{
                    interestEarned = amount * 0.02;
                }
                break;
            case 'X':
                if(amount<5000){
                    System.out.println("The balance in your account is below the minimum value needed to earn interest");
                }else{
                    interestEarned = amount * 0.05;
                }
                break;
            default:    System.out.println("The account type does not exist");
                        break;
        }
        System.out.println("The amount of interest earned is "+ interestEarned);
    }
}