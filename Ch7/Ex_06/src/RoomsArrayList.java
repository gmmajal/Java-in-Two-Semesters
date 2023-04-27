import java.util.Scanner;
import java.util.ArrayList;

public class RoomsArrayList {
        public static void main(String[] args) {

            System.out.println("Please enter the number of rooms: ");
            Scanner keyboard = new Scanner(System.in);
            int numberOfRooms = keyboard.nextInt();

            while(numberOfRooms <= 0){
                System.out.println("Please enter a positive integer: ");
                numberOfRooms = keyboard.nextInt();
            }

            ArrayList<Oblong> rooms = new ArrayList<>();
            rooms = initialize(rooms, numberOfRooms);

            System.out.println("The number of rooms are: " + numberOfRooms);
            System.out.println();
            System.out.println("Please enter the room number for which you would like to retrieve the info " + "[1 - " + numberOfRooms + "]:");
            int roomNum = keyboard.nextInt();
            double len = rooms.get(roomNum - 1).getLength();
            double height = rooms.get(roomNum - 1).getHeight();
            double area = rooms.get(roomNum - 1).calculateArea();
            System.out.println();
            System.out.println("The info for room number " + roomNum + " is as follows: ");
            System.out.println("The length for room number " + roomNum + " is: " + len);
            System.out.println("The height for room number " + roomNum + " is: " + height);
            System.out.println("The area for room number " + roomNum + " is: " + area);
        }

        public static ArrayList<Oblong> initialize(ArrayList<Oblong> arrayIn, int size){
            Scanner keyboard = new Scanner(System.in);
            for (int i = 0; i < size; ++i){
                System.out.println("Please enter the first dimension of room " + (i + 1) + ": ");
                double lenIn = keyboard.nextDouble();
                while(lenIn <= 0){
                    System.out.println("Please enter a positive double value: ");
                    lenIn = keyboard.nextDouble();
                }
                System.out.println("Please enter the second dimension of room " + (i + 1) + ": ");
                double heightIn = keyboard.nextDouble();
                while(heightIn <= 0){
                    System.out.println("Please enter a positive double value: ");
                    heightIn = keyboard.nextDouble();
                }
                Oblong ob = new Oblong(lenIn,heightIn);
                arrayIn.add(ob);
            }
            return arrayIn;
        }
    }