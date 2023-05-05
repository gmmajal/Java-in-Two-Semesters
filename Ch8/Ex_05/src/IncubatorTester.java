import java.util.ArrayList;

public class IncubatorTester {
    public static void main(String [] args){
        Incubator inc1 = new Incubator();
        Incubator inc2 = new Incubator();
        ArrayList<Incubator> incubatorList = new ArrayList<>();
        incubatorList.add(inc1);
        incubatorList.add(inc2);
        for(int i = 0; i < incubatorList.size(); ++i){
            if (i == 0){
                System.out.println("\n");
                int temp = incubatorList.get(i).getTemperature();
                System.out.println("The temperature is " + temp);
                System.out.println("\n");
                boolean inRange;
                while(incubatorList.get(i).getTemperature() < Incubator.MAX){
                    inRange = incubatorList.get(i).increaseTemperature();
                    temp = incubatorList.get(i).getTemperature();
                    System.out.println("The temperature is " + temp);
                    System.out.println("Is the temperature within the accepted range? Ans: " + inRange);
                    System.out.println("\n");
                }
                inRange = incubatorList.get(i).increaseTemperature();
                temp = incubatorList.get(i).getTemperature();
                System.out.println("The temperature is " + temp);
                System.out.println("Is the temperature within the accepted range? Ans: " + inRange);
            }else{
                System.out.println("\n");
                int temp = incubatorList.get(i).getTemperature();
                System.out.println("The temperature is " + temp);
                System.out.println("\n");
                boolean inRange;
                while(incubatorList.get(i).getTemperature() > Incubator.MIN){
                    inRange = incubatorList.get(i).decreaseTemperature();
                    temp = incubatorList.get(i).getTemperature();
                    System.out.println("The temperature is " + temp);
                    System.out.println("Is the temperature within the accepted range? Ans: " + inRange);
                    System.out.println("\n");
                }
                inRange = incubatorList.get(i).decreaseTemperature();
                temp = incubatorList.get(i).getTemperature();
                System.out.println("The temperature is " + temp);
                System.out.println("Is the temperature within the accepted range? Ans: " + inRange);
            }
        }
    }
}
