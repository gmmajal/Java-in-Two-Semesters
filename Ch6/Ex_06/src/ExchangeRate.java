import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
        double[] sterling = new double[5];
        double[] dollar;

        System.out.println("Initializing the array with 5 products...");
        sterling = initializeSterling(sterling);
        dollar = convertToDollar(sterling);
        displayArray(sterling,dollar);
    }

    public static double[] initializeSterling(double[] arrayIn){
        System.out.println("Please enter the price of 5 products in pounds sterling: ");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < arrayIn.length;++i){
            arrayIn[i] = keyboard.nextDouble();
        }
        System.out.println();
        return arrayIn;
    }

    public static double[] convertToDollar(double[] arrayIn){
        System.out.println("Converting the price of 5 products to US dollar... ");
        double[] array= new double[arrayIn.length];
        for(int i = 0; i < arrayIn.length;++i){
            array[i] = arrayIn[i] * 1.25;
        }
        System.out.println();
        return array;
    }
    public static void displayArray(double[] arrayIn1, double[] arrayIn2){
        System.out.println("The contents of the arrays are as follows: ");
        System.out.println();
        for(int i = 0;i < arrayIn1.length;++i){
            System.out.println("sterling[" + i +"]=" + arrayIn1[i]);
            System.out.println("dollar[" + i +"]=" + arrayIn2[i]);
            System.out.println();
        }
    }
}