import java.util.Scanner;

public class Rooms {
    public static void main(String[] args) {

        System.out.println("Please enter the number of rooms: ");
        Scanner keyboard = new Scanner(System.in);
        int numberOfRooms = keyboard.nextInt();

        while(numberOfRooms <= 0){
            System.out.println("Please enter a positive integer: ");
            numberOfRooms = keyboard.nextInt();
        }

        Oblong[] rooms = new Oblong[numberOfRooms];
        rooms = initialize(rooms);

        System.out.println("The number of rooms are: " + numberOfRooms);
        System.out.println();
        System.out.println("Please enter the room number for which you would like to retrieve the info " + "[1 - " + numberOfRooms + "]:");
        int roomNum = keyboard.nextInt();
        double len = rooms[roomNum - 1].getLength();
        double height = rooms[roomNum - 1].getHeight();
        double area = rooms[roomNum - 1].calculateArea();
        System.out.println();
        System.out.println("The info for room number " + roomNum + " is as follows: ");
        System.out.println("The length for room number " + roomNum + " is: " + len);
        System.out.println("The height for room number " + roomNum + " is: " + height);
        System.out.println("The area for room number " + roomNum + " is: " + area);
    }

    public static Oblong[] initialize(Oblong[] arrayIn){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < arrayIn.length; ++i){
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
            arrayIn[i] = ob;
        }
        return arrayIn;
    }
}