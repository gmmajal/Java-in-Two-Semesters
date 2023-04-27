import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String string1, string2;
        int comparison;

        // get two strings from the user
        System.out.print("Enter a String: ");
        string1 = keyboard.next();
        System.out.print("Enter another String: ");
        string2 = keyboard.next();

        string1 = string1.trim();
        string2 = string2.trim();

        // compare the strings
        if(string1.equalsIgnoreCase(string2)){
            System.out.println("The strings are identical");
        }else{
            System.out.println("The strings are not identical");
        }
    }
}