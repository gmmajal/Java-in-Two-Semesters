public class Incubator {
    private int temperature;

    public static int MAX = 10;

    public static int MIN = -10;

    public Incubator(){
        temperature = 5;
    }

    public int getTemperature(){
        return temperature;
    }

    public boolean increaseTemperature(){
        int check = temperature + 1;
        if(check > MAX){
            return false;
        }else{
            temperature = temperature + 1;
            return true;
        }
    }

    public boolean decreaseTemperature(){
        int check = temperature - 1;
        if(check < MIN){
            return false;
        }else{
            temperature = temperature - 1;
            return true;
        }
    }

}