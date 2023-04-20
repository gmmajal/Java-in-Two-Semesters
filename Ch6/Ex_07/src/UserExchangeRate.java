import java.util.Scanner;

public class UserExchangeRate {
    public static void main(String[] args) {
        System.out.println("Please enter the number of products:");
        Scanner keyboard =  new Scanner(System.in);
        int size = keyboard.nextInt();
        double[] sterling = new double[size];
        double[] dollar;

        System.out.println("Initializing the array with " + size +" products...");
        sterling = initializeSterling(sterling);
        dollar = convertToDollar(sterling);
        displayArray(sterling,dollar);
        displayTotalCost(sterling,dollar);
    }

    public static double[] initializeSterling(double[] arrayIn){
        System.out.println("Please enter the price of " + arrayIn.length+ " products in pounds sterling: ");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < arrayIn.length;++i){
            arrayIn[i] = keyboard.nextDouble();
        }
        System.out.println();
        return arrayIn;
    }

    public static double[] convertToDollar(double[] arrayIn){
        System.out.println("Converting the price of " + arrayIn.length+ " products to US dollar... ");
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

    public static void displayTotalCost(double[] arrayIn1, double[] arrayIn2){
        System.out.println("The total price of the products is as follows: ");
        double tot1 = 0.0;
        double tot2 = 0.0;
        for(int i = 0; i < arrayIn1.length;++i){
            tot1 += arrayIn1[i];
            tot2 += arrayIn2[i];
        }
        System.out.println("The total sum of prices in pounds sterling is " + tot1);
        System.out.println("The total sum of prices in US dollars is " + tot2);
    }
}

