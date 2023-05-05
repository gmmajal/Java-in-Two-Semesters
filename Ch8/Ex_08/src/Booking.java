public class Booking {
    private String room;
    private String name;

    public Booking(String r, String n){
        room = r;
        name = n;
    }
    public String getRoom(){
        return room;
    }
    public String getName(){
        return name;
    }
}