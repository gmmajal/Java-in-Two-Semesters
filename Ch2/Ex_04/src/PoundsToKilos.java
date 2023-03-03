import java.util.Scanner;
public class PoundsToKilos {
    public static void main(String[] args) {
        float pounds,kilos;
        System.out.println("Please enter the value of the weight in pounds: ");
        Scanner keyboard = new Scanner(System.in);
        pounds = keyboard.nextFloat();
        kilos = pounds / (float) 2.2;
        System.out.println(" The weight in kilograms is: " + kilos);
    }
}