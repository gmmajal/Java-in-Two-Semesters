public class SafeSensor extends Sensor{
    private double max;

    public SafeSensor(double m){
        super(10);
        max = m;
    }

    public SafeSensor(double m, double i){
        super(i);
        max = m;
    }

    @Override
    public boolean setPressure(double p){
        if( (p > 0.0) & (p <= max)){
            return true;
        }
        else{
            return false;
        }
    }
    public double getMax(){
        return max;
    }
}
