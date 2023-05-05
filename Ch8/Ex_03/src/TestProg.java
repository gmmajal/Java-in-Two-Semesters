import java.util.Scanner;
public class TestProg
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String tempNumber;
        String tempName;
        double tempPrice;



        System.out.print("Enter the stock number: ");
        tempNumber = keyboardString.nextLine();
        System.out.print("Enter the name of the item: ");
        tempName = keyboardString.nextLine();
        System.out.print("Enter the price of the item: ");
        tempPrice = keyboard.nextDouble();

        // Create a new item of stock using the values that were entered by the user
        StockItem item = new StockItem(tempNumber,tempName,tempPrice);
        StockItem.setSalesTax(10);
        // Increase the total number of items in stock by 5
        item.increaseTotalStock(5);
        // Display the stock number
        String stockNumber = item.getStockNumber();
        System.out.println("The stock number for the item is : " + stockNumber);
        // Display the total price of all items in stock
        double totalPrice = item.calculateTotalPrice();
        double tax = StockItem.getSalesTax();
        System.out.println("The total price is : " + totalPrice);

        System.out.println("The sales tax for item " + stockNumber + " is " + tax);
    }
}
