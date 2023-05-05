public class StockItem {
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;
    private static double salesTax;

    public StockItem(String stN, String n, double p){
        stockNumber = stN;
        name = n;
        price = p;
        totalStock = 0;
    }

    public void setPrice(double p){
        price = p;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public String getName(){
        return name;
    }

    public int getTotalStock(){
        return totalStock;
    }

    public double getPrice(){
        return price;
    }

    public void increaseTotalStock(int val){
        totalStock = totalStock + val;
    }

    public double calculateTotalPrice(){
        return totalStock * price;
    }

    public static void setSalesTax(double val){
        salesTax = val;
    }

    public static double getSalesTax(){
        return salesTax;
    }
}