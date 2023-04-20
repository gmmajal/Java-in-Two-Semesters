import java.util.Scanner;

public class MagicWordSquare {
    public static void main(String[] args) {
        System.out.println("Please enter the dimension of the square:");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        char[][] magicSquare = new char[size][size];
        magicSquare = initializeArray(magicSquare);
        System.out.println("The array has been intialized and has dimensions " + size + " X " + size);
        System.out.println();
        System.out.println("Please enter a row Number[0-" + (size - 1) + "]:");
        int rowNum = keyboard.nextInt();
        while(rowNum<0 || rowNum>=size){
            System.out.println("Please enter a row Number[0-" + (size - 1) + "]!");
            rowNum = keyboard.nextInt();
        }
        displayRow(magicSquare,rowNum);
        System.out.println("Please enter a column Number[0-" + (size - 1) + "]:");
        int colNum = keyboard.nextInt();
        while(colNum<0 || colNum>=size){
            System.out.println("Please enter a column Number[0-" + (size - 1) + "]!");
            colNum = keyboard.nextInt();
        }
        displayColumn(magicSquare,colNum);
    }

    public static char[][] initializeArray(char[][] arrayIn) {
        System.out.println("Initializing array...");
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < arrayIn.length; ++i){
            for(int j = 0; j < arrayIn[0].length; ++j){
                arrayIn[i][j] = keyboard.next().charAt(0);
            }
        }
        return arrayIn;
    }
    public static void displayRow(char[][] arrayIn, int rowNumber){
        System.out.println("The entries for row number " + rowNumber + " are: ");
        for (int j = 0; j < arrayIn[0].length; ++j){
            System.out.print(arrayIn[rowNumber][j]);
        }
        System.out.println();
    }

    public static void displayColumn(char[][] arrayIn, int colNumber){
        System.out.println("The entries for column number " + colNumber + " are: ");
        for (int i = 0; i < arrayIn.length; ++i){
            System.out.print(arrayIn[i][colNumber]);
        }
        System.out.println();
    }
}

