public class SafeSensorTester {
    public static void main(String[] args){
        SafeSensor ss = new SafeSensor(25);
        System.out.println("The maximum safe value is " + ss.getMax() + " and the initial pressure is "+ ss.getPressure());
        System.out.println();
        boolean isOk= ss.setPressure(30);
        System.out.println("Is the pressure value within a safe range? Ans: " + isOk);
        isOk= ss.setPressure(-2);
        System.out.println("Is the pressure value within a safe range? Ans: " + isOk);
        isOk= ss.setPressure(20);
        System.out.println("Is the pressure value within a safe range? Ans: " + isOk);
        System.out.println();
        ss = new SafeSensor(30, 15);
        System.out.println("The maximum safe value is " + ss.getMax() + " and the initial pressure is "+ ss.getPressure());
    }
}
