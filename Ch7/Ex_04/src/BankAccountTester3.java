import java.util.Scanner;

public class BankAccountTester3 {
    public static void main(String[] args) {
        BankAccount bacc1 = new BankAccount("2349876","John Doe");
        BankAccount bacc2 = new BankAccount("5986582", "Jane Lyn");
        Scanner keyboard =  new Scanner(System.in);
        char requests = 'y';
        do {
            System.out.println("Please enter an account number: ");
            String accountNumber = keyboard.next();
            while (!accountNumber.equals("2349876") && !accountNumber.equals("5986582")) {
                System.out.println("The account number entered did not match any of the Bank account stored. Please reenter:");
                accountNumber = keyboard.next();
            }
            System.out.println("Please enter an amount to deposit: ");
            String amount = keyboard.next();
            if (accountNumber.equals("2349876")) {
                bacc1.deposit(Double.parseDouble(amount));
            } else {
                bacc2.deposit(Double.parseDouble(amount));
            }
            System.out.println("Do you wish to continue[y/n]?");
            requests = keyboard.next().charAt(0);
        }while(requests =='y' || requests =='Y');

        System.out.println("Details from the first bank account");
        System.out.println("The account name is: " + bacc1.getAccountName());
        System.out.println("The account number is: " + bacc1.getAccountNumber());
        System.out.println("The balance in the account is: " + bacc1.getBalance());

        System.out.println();

        System.out.println("Details from the second bank account");
        System.out.println("The account name is: " + bacc2.getAccountName());
        System.out.println("The account number is: " + bacc2.getAccountNumber());
        System.out.println("The balance in the account is: " + bacc2.getBalance());
    }
}