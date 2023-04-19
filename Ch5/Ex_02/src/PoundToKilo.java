import java.util.Scanner;

public class PoundToKilo {
    public static void main(String[] args) {
        System.out.println("Please enter the value in pounds(lb): ");
        Scanner keyboard = new Scanner(System.in);
        double val_p = keyboard.nextDouble();
        double val_k = p2K(val_p);
        System.out.println("The value in kilograms(kg): " + val_k);
    }
    public static double p2K(double p){
        return p/2.2;
    }
}