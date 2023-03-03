import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final float pi = (float) 3.1416;
        float radius, circumference, area;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        radius  = keyboard.nextFloat();
        circumference = 2*pi*radius;
        area = pi*radius*radius;
        System.out.println("The area of the circle is : " + area);
        System.out.println("The circumference of the circle is : " + circumference);
    }
}