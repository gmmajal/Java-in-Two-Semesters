public class ApartmentTester {
    public static void main(String[] args){
        Oblong o1 = new Oblong(1f,2f);
        Oblong o2 = new Oblong(3f,4f);

        Apartment ap = new Apartment();
        ap.add(o1);
        ap.add(o2);

        double area = ap.getRoomArea(-1);
        System.out.println("The area of the room is " + area);//Should return -999
        area = ap.getRoomArea(2);
        System.out.println("The area of the room is " + area);//Should return -999
        area = ap.getRoomArea(0);
        System.out.println("The area of the room is " + area);//Should return 2
        area = ap.getRoomArea(1);
        System.out.println("The area of the room is " + area);//Should return 12
        System.out.println("\n");

        double len = ap.getRoomLength(-1);
        System.out.println("The area of the room is " + len);//Should return -999
        len = ap.getRoomLength(2);
        System.out.println("The area of the room is " + len);//Should return -999
        len = ap.getRoomLength(0);
        System.out.println("The area of the room is " + len);//Should return 1
        len = ap.getRoomLength(1);
        System.out.println("The length of the room is " + len);//Should return 3
        System.out.println("\n");

        double h = ap.getRoomHeight(-1);
        System.out.println("The height of the room is " + h);//Should return -999
        h = ap.getRoomHeight(2);
        System.out.println("The height of the room is " + h);//Should return -999
        h = ap.getRoomHeight(0);
        System.out.println("The height of the room is " + h);//Should return 2
        h = ap.getRoomHeight(1);
        System.out.println("The height of the room is " + h);//Should return 4
        System.out.println("\n");
    }
}
