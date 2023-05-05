import java.lang.Math.*;

public class CircularShape {
    private double radius;

    public CircularShape(double rad){
        radius = rad;
    }
    public void setRadius(double rad){
        radius = rad;
    }

    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
        return Math.PI * radius *radius;
    }

    public double calculateCircumference(){
        return Math.PI * 2.0 * radius;
    }

    public double calculateDiameter(){
        return 2.0 * radius;
    }

}