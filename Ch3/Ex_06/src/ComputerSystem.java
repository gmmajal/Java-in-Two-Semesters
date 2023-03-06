import java.util.Scanner;
public class ComputerSystem {
    public static void main(String[] args) {
        double price = 375.99;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome! The basic system costs 375.99. Please specify the screen size(type either 38 or 43):");
        int screenSize= keyboard.nextInt();
        if(screenSize == 38){
            price += 75.99;
        }else{
            price += 99.99;
        }
        System.out.println("Would you like to add a printer?(type y or n):");
        char printerFlag = keyboard.next().charAt(0);
        if (printerFlag =='y'){
            price +=125.00;
        }
        System.out.println("Would you like to add an anti virus program?(type y or n):");
        char virusFlag = keyboard.next().charAt(0);
        if (virusFlag =='y'){
            price +=65.99;
        }
        System.out.println("The computer system will cost you "+ price);
    }
}