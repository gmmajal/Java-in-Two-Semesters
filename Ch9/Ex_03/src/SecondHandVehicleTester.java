public class SecondHandVehicleTester {
    public static void main(String[] args){
        SecondHandVehicle v1 = new SecondHandVehicle("LXY2429","Toyota",1999, 250000, 1);
        int owners = v1.getNumberOfOwners();
        String regNo = v1.getRegNo();
        String make = v1.getMake();
        int year = v1.getYearOfManufacture();
        double value = v1.getValue();
        boolean hasMultOwners = v1.hasMultipleOwners();
        System.out.println("The car has a registration no: " + regNo);
        System.out.println("The car has make: " + make);
        System.out.println("The car was manufactured in : " + year);
        System.out.println("The car has value: " + value);
        System.out.println("The number of owners are : " + owners);
        System.out.println("Was the car owned multiple times?Ans: " + hasMultOwners);
        System.out.println();

        v1.setNumberOfOwners(2);
        owners = v1.getNumberOfOwners();
        v1.setValue(150000);
        value = v1.getValue();
        hasMultOwners = v1.hasMultipleOwners();
        System.out.println("The car has a registration no: " + regNo);
        System.out.println("The car has make: " + make);
        System.out.println("The car was manufactured in : " + year);
        System.out.println("The car has value: " + value);
        System.out.println("The number of owners are : " + owners);
        System.out.println("Was the car owned multiple times?Ans: " + hasMultOwners);


    }
}
