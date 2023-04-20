import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Please enter the largest dimension of the triangle:");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        double[][] tri = new double[size][];
        for(int i = 0;i < size;++i){
            tri[i] = new double[i+1];
        }
        System.out.println("Initializing arrays...");
        tri = initializeArray(tri);
        displayArray(tri);
        double max = findMax(tri);
        System.out.println();
        System.out.println("Maximum value in the array is " + max);
    }

    public static double[][] initializeArray(double[][] arrayIn){

        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;i < arrayIn.length;++i){
            for(int j = 0;j < arrayIn[i].length;++j){
                System.out.println("Entry at array[" + i + "][" + j + "]=");
                arrayIn[i][j] = keyboard.nextDouble();
            }
        }
        return arrayIn;
    }

    public static void displayArray(double[][] arrayIn){
        System.out.println();
        System.out.println("The entries in the array are:");
        for(int i = 0 ; i < arrayIn.length;++i) {
            for (int j = 0; j < arrayIn[i].length; ++j) {
                System.out.print(arrayIn[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static double findMax(double[][] arrayIn){
        double maxVal = arrayIn[0][0];
        for(int i = 0 ; i < arrayIn.length;++i){
            for(int j = 0; j < arrayIn[i].length;++j){
                if(arrayIn[i][j] > maxVal){
                    maxVal = arrayIn[i][j];
                }
            }
        }
        return maxVal;
    }
}