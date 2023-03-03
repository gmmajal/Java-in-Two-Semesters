import java.util.Scanner;
public class NumberOfTeams {
    public static void main(String[] args) {
        int students,teamSize, teams, remainder;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        students = keyboard.nextInt();
        System.out.println("Please enter the size of the team: ");
        teamSize = keyboard.nextInt();
        remainder = students % teamSize;
        teams = students / teamSize;
        System.out.println(" The number of teams that can be formed is " + teams);
        System.out.println(" The number of students without a team is/are " + remainder);
    }
}