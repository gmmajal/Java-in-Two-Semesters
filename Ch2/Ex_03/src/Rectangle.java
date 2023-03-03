import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        float length, height, area, perimeter;
        Scanner keyboard = new Scanner(System.in);
        //Prompt the user to provide the length and height of the rectangle
        System.out.println("Please enter the length of the rectangle:");
        length = keyboard.nextFloat();
        System.out.println("Please enter the height of the rectangle:");
        height = keyboard.nextFloat();

        //calculate the perimeter and area of the rectangle based on the user-specified dimensions
        perimeter = 2*(length+height);
        area = length * height;

        //display the results
        System.out.println("The perimeter of the rectangle is : " + perimeter);
        System.out.println("The area of the rectangle is : " + area);
    }
}