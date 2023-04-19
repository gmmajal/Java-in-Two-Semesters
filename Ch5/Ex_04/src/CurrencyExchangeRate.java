import java.util.Scanner;

public class CurrencyExchangeRate {
    public static void main(String[] args) {
        char request;
        do{
            double m = getMoney();
            double ex = getExRate();
            double c = convertCurrency(m, ex);
            displayResult(c);
            System.out.println("Would you like to continue[y/n]?");
            Scanner keyboard = new Scanner(System.in);
            request = keyboard.next().charAt(0);
        }while (request =='y' || request == 'Y');
    }
    public static double getMoney(){
        System.out.println("Please enter the sum of money to be exchanged: ");
        Scanner keyboard = new Scanner(System.in);
        double val = keyboard.nextDouble();
        return val;
    }
    public static double getExRate(){
        System.out.println("Please enter the exchange rate: ");
        Scanner keyboard = new Scanner(System.in);
        double val = keyboard.nextDouble();
        return val;
    }
    public static double convertCurrency(double sum, double exrate){
        double val = sum * exrate;
        return val;
    }
    public static void displayResult(double value){
        System.out.println("The converted currency value is: " +  value);
    }
}