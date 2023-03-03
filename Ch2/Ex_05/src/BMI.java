import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms: ");
        weight = keyboard.nextFloat();
        System.out.println("Please enter your height in meter: ");
        height = keyboard.nextFloat();
        bmi = weight/(height*height);
        System.out.println("Your BMI value is :" + bmi);
    }
}