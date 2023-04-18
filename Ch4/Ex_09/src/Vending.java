import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
    char request;
    int gumCount = 0; int chocolateCount = 0; int popcornCount = 0; int juiceCount = 0;
        do{
            System.out.println();
            System.out.println( "[1] Get gum");
            System.out.println( "[2] Get chocolate");
            System.out.println( "[3] Get popcorn");
            System.out.println( "[4] Get juice");
            System.out.println( "[5] Display total sold so far");
            System.out.println( "[6] Quit");
            System.out.println();
            System.out.println("Please select an option [1-6]:");
            Scanner keyboard = new Scanner(System.in);
            request = keyboard.next().charAt(0);
           switch (request) {
               case '1':
                   //Gum
                   System.out.println("Here is your gum");
                   gumCount += 1;
                   break;
               case '2':
                   //Chocolate
                   System.out.println("Here is your chocolate");
                   chocolateCount += 1;
                   break;
               case '3':
                   //Popcorn
                   System.out.println("Here is your popcorn");
                   popcornCount += 1;
                   break;
               case '4':
                   //Juice
                   System.out.println("Here is your juice");
                   juiceCount += 1;
                   break;
               case '5':
                   //Total items sold
                   System.out.println(gumCount + " items of gum sold");
                   System.out.println(chocolateCount + " items of chocolate sold");
                   System.out.println(popcornCount + " items of popcorn sold");
                   System.out.println(juiceCount + " items of juice sold");
                   break;
               case '6':
                   System.out.println("Thank you for using this vending machine");
                   break;
               default:
                   System.out.println("Please select an option between [1-6] !");
                   break;
           }
        }while(request!='6');
    }
}