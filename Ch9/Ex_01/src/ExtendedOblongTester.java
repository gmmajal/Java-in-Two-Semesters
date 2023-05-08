import java.util.Scanner;

public class ExtendedOblongTester
{
	public static void main(String[] args)
	{
		System.out.println("Please enter a character:");
		Scanner keyboard = new Scanner(System.in);
		char c = keyboard.next().charAt(0);
		System.out.println();
		ExtendedOblong extOblong = new ExtendedOblong(10.2,5.3,c);
		System.out.println(extOblong.draw());

	}
}
