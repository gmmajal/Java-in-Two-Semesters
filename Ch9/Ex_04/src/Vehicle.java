public class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String r, String m, int y, double v){
        regNo = r;
        make = m;
        yearOfManufacture = y;
        value = v;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake(){
        return make;
    }

    public int getYearOfManufacture(){
        return yearOfManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateAge(int i){
        return i - yearOfManufacture;
    }
}