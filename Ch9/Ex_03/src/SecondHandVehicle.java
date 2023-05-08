public class SecondHandVehicle extends Vehicle{
    private int numberOfOwners;
    public SecondHandVehicle(String r, String m, int y, double v, int n){
        super(r,m,y,v);
        numberOfOwners = n;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    public void setNumberOfOwners(int n){
        numberOfOwners = n;
    }

    public boolean hasMultipleOwners(){
        if(numberOfOwners > 1){
            return true;
        }else {
            return false;
        }
    }
}
