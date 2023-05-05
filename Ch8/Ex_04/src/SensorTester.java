import java.util.ArrayList;

public class SensorTester {
    public static void main(String[] args) {
        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor(11.0);
        ArrayList<Sensor> sensorList = new ArrayList<>();
        sensorList.add(s1);
        sensorList.add(s2);
        for(int i = 0; i < sensorList.size(); ++i){
            if (i == 0){
                System.out.println("\n");
                double p = sensorList.get(i).getPressure();
                System.out.println("The sensor pressure is " + p);
                boolean isValid = sensorList.get(i).setPressure(-12.0);
                System.out.println("Is the sensor pressure valid? Ans: " + isValid);
                p = sensorList.get(i).getPressure();
                System.out.println("The modified sensor pressure is " + p);
            }else{
                System.out.println("\n");
                double p = sensorList.get(i).getPressure();
                System.out.println("The sensor pressure is " + p);
                boolean isValid = sensorList.get(i).setPressure(100);
                System.out.println("Is the sensor pressure valid? Ans: " + isValid);
                p = sensorList.get(i).getPressure();
                System.out.println("The modified sensor pressure is " + p);
            }

        }
    }

}
