import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        final double pi = 3.1416;
        char request;
        double r = 0.0;
        int set_radius = 1;
        do {
            System.out.println();
            System.out.println("[1] Set radius");
            System.out.println("[2] Display radius");
            System.out.println("[3] Display area");
            System.out.println("[4] Display circumference");
            System.out.println("[5] Quit");
            System.out.println("Please select an option [1-5]:");
            Scanner keyboard = new Scanner(System.in);
            request = keyboard.next().charAt(0);
            double area, circumference;
            switch (request)
            {
                case '1':
                    System.out.println("Please enter the radius: ");
                    r = keyboard.nextDouble();
                    while (r < 0) {
                        System.out.println("Error! The radius specified must be positive: ");
                        r = keyboard.nextDouble();
                    }
                    set_radius = 0 ;
                    break;
                case '2':
                    if(set_radius == 1) {
                        System.out.println("The radius has not been set yet!");
                    } else{
                        System.out.println("The radius is: " + r);
                    }
                    break;
                case '3':
                    if(set_radius == 0) {
                        area = pi * r * r;
                        System.out.println("The area is: " + area);
                    } else{
                        System.out.println("The radius has not been set yet! Please prescribe a radius before calculating the area");
                    }
                    break;
                case '4':
                    if (set_radius == 0) {
                        circumference = 2.0 * pi * r;
                        System.out.println("The circumference is: " + circumference);
                    } else{
                        System.out.println("The radius has not been set yet! Please prescribe a radius before calculating the circumference");
                    }
                     break;
                case '5':
                    System.out.println("Quitting!");
                    break;
                default:
                    System.out.println("Please select an option in the range [1-5]!");
                    break;
            }
        }while(request !='5');
    }
}
