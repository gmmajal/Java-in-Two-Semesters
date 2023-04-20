import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        int[] javaStudents;
        System.out.println("Please enter the number of students: ");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        javaStudents = new  int[num];
        System.out.println();
        System.out.println("Please the score obtained by the students: ");
        enterExamMarks(javaStudents);
        System.out.println();
        System.out.println("Each student's score is now increased by 5 marks...");
        System.out.println();
        javaStudents = increaseMarks(javaStudents);
        System.out.println();
        System.out.println("Checking if all students passed their exam or not...");
        System.out.println();
        boolean check = allHavePassed(javaStudents);
        if(check){
            System.out.println("All students passed the exam");
        }
        else{
            System.out.println("All students did not pass the exam");
        }
    }

    public static void enterExamMarks(int[] arrayIn){
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < arrayIn.length; ++i){
            arrayIn[i] = keyboard.nextInt();
        }
    }
    public static int[] increaseMarks(int[] arrayIn) {
        for(int i = 0; i < arrayIn.length; ++i){
                arrayIn[i] = arrayIn[i] + 5;
                System.out.println("array[" + i +"]= " + arrayIn[i]);
        }
        return arrayIn;
    }

    public static boolean allHavePassed(int[] arrayIn){
        for(int i = 0; i < arrayIn.length; ++i){
            if(arrayIn[i] < 40){
                return false;
            }
        }
        return true;
    }
}