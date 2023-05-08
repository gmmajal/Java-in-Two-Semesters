import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesMenu {
    public static void main(String[] args){
        char request;
        ArrayList<Vehicle> vehicleList =  new ArrayList<>();
        do{
            System.out.println();
            System.out.println("Welcome to the vehicle menu!");
            System.out.println("[1] Add vehicle");
            System.out.println("[2] Display a list of vehicle details");
            System.out.println("[3] Delete a vehicle");
            System.out.println("[4] Quit");

            Scanner keyboard = new Scanner(System.in);

            request = keyboard.next().charAt(0);
            System.out.println();
            switch (request) {
                case '1':
                    System.out.println("Please enter the regNo: ");
                    String regNo = keyboard.next();
                    System.out.println("Please enter the make: ");
                    String make = keyboard.next();
                    System.out.println("Please enter the year: ");
                    int year = keyboard.nextInt();
                    System.out.println("Please enter the value: ");
                    double value = keyboard.nextDouble();
                    Vehicle v = new Vehicle(regNo, make, year, value);
                    vehicleList.add(v);
                    break;
                case '2':
                    for (int i = 0; i < vehicleList.size(); ++i) {
                        v = vehicleList.get(i);
                        System.out.println();
                        System.out.println("The car has the registration number: " + v.getRegNo());
                        System.out.println("The car has the make : " + v.getMake());
                        System.out.println("The car was manufactured in the year: " + v.getYearOfManufacture());
                        System.out.println("The car has value: " + v.getValue());
                        System.out.println();
                    }
                    break;
                case '3':
                    System.out.println("Removing the earliest car added to the list");
                    vehicleList.remove(0);
                    break;
                case '4':
                    System.out.println("Exiting menu");
                    break;
                default:
                    System.out.println("Please enter a number in the range [1-4]");
                    break;
            }
        }while(request != '4');
    }
}
