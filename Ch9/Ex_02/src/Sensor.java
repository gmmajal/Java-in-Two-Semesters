public class Sensor {
    private double pressure;

    public Sensor(){
        pressure = 0.0;
    }

    public Sensor(double p){
        pressure = p;
    }

    public boolean setPressure(double p){
        if (p < 0.0){
            return false;
        }
        else{
            pressure = p;
            return true;
        }
    }

    public double getPressure(){
        return pressure;
    }
}