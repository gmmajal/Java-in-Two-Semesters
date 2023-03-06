import java.util.Scanner;
public class DisplayResult {
    public static void main(String[] args) {

        int mark;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What exam marks did you get?");
        mark = keyboard.nextInt();
        if (mark >= 40 && mark < 70) {
            System.out.println("Congratulations, you passed");
        }
        else if(mark>=70){
            System.out.println("Congratulations, you passed with distinction");
        }
        else {
            System.out.println("I'm sorry, but you failed");
        }
        System.out.println("Good luck with your other exams");
    }
}