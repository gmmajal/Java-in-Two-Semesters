import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Please enter the length(m): ");
        Scanner keyboard = new Scanner(System.in);
        double len = keyboard.nextDouble();
        System.out.println("Please enter the height(m): ");
        double height = keyboard.nextDouble();
        double a = area(len,height);
        double p = perimeter(len, height);
        System.out.println("The perimeter of the rectangle is: " + p);
        System.out.println("The area of the rectangle is: " + a);
    }
    public static double perimeter(double l, double h){
        return 2.0 * (l + h);
    }
    public static double area(double l, double h){
        return l * h;
    }
}