import java.util.Scanner;
public class BMIClassification {
    public static void main(String[] args) {
        float weight, height;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your weight in kg:");
        weight = keyboard.nextFloat();
        System.out.println("Please enter your height in m:");
        height = keyboard.nextFloat();
        float bmi = weight/(height*height);
        if (bmi>24.9){
            System.out.println("BMI classification: Overweight");
        } else if ( 18.5<= bmi && bmi <=24.9) {
            System.out.println("BMI classification: Healthy");
        }else{
            System.out.println("BMI classification: Underweight");
        }
    }
}