public class SelfTest5 {
    public static void main (String[] args)
    {
        int x, y, z;
        x = 5;
        y = x + 2; // y = 7
        x = 10;
        z = y * x; // z = 10*7
        System.out.println(z); // it should print 70
    }
}
