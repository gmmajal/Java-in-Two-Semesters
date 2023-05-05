import java.util.Scanner;

public class TestCircularShape {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double rad = keyboard.nextDouble();
        CircularShape c = new CircularShape(rad);
        double diameter = c.calculateDiameter();
        double circumference = c.calculateCircumference();
        double area = c.calculateArea();
        System.out.println("The diameter of the circular shape is " + diameter);
        System.out.println("The circumference of the circular shape is " + circumference);
        System.out.println("The area of the circular shape is " + area);
        System.out.println("\n");

        c.setRadius(3);
        diameter = c.calculateDiameter();
        circumference = c.calculateCircumference();
        area = c.calculateArea();
        System.out.println("The diameter of the circular shape is " + diameter);
        System.out.println("The circumference of the circular shape is " + circumference);
        System.out.println("The area of the circular shape is " + area);
        System.out.println("\n");
    }
}
