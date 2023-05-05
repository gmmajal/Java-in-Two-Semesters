public class TimeTableTest {
    public static void main(String[] args){
        String room = "Munin";
        String name = "Djames Knox";
        Booking b = new Booking(room, name);

        TimeTable t = new TimeTable(4, 5);
        int days = t.numberOfDays();
        int periods = t.numberOfPeriods();
        System.out.println("The number of days is " + days + " and the number of periods is " + periods);
        System.out.println("\n");


        boolean isBookingValid = t.makeBooking(1,2, b);
        System.out.println("The booking outcome is " + isBookingValid);//should return true;
        isBookingValid = t.makeBooking(4,2,b);
        System.out.println("The booking outcome is " + isBookingValid);//should return false;
        isBookingValid = t.makeBooking(3,5,b);
        System.out.println("The booking outcome is " + isBookingValid);//should return false;

        System.out.println("\n");
        Booking bTimeTable = t.getBooking(1,2);
        String bookedName = bTimeTable.getName();
        String bookedRoom = bTimeTable.getRoom();
        System.out.println("The booking for day 1, period 2 is by " + bookedName + " for room " + bookedRoom);
        System.out.println("\n");

        bTimeTable = t.getBooking(1,1);
        if (bTimeTable == null){
            System.out.println("There is no booking for the specified slot");
        }
        System.out.println("\n");

        boolean isSlotFree = t.isFree(1,2);
        System.out.println("Is the slot free? Ans: " + isSlotFree);//should return false;
        isSlotFree = t.isFree(4,2);
        System.out.println("Is the slot free? Ans: " + isSlotFree);//should return false;
        isSlotFree = t.isFree(3,5);
        System.out.println("Is the slot free? Ans: " + isSlotFree);//should return false;
        isSlotFree = t.isFree(1,1);
        System.out.println("Is the slot free? Ans: " + isSlotFree);//should return true;
        System.out.println("\n");

        boolean isCancelled = t.cancelBooking(4,2);
        System.out.println("Is the booking cancelled? Ans: " + isCancelled);//should return false;
        isCancelled = t.cancelBooking(3,5);
        System.out.println("Is the booking cancelled? Ans: " + isCancelled);//should return false;
        isCancelled = t.cancelBooking(1,1);
        System.out.println("Is the booking cancelled? Ans: " + isCancelled);//should return false;
        isCancelled = t.cancelBooking(1,2);
        System.out.println("Is the booking cancelled? Ans: " + isCancelled);//should return true;
    }
}
