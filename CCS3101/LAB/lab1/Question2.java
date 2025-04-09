class Stock {
    // Fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Method to calculate percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Setter for previous closing price
    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    // Setter for current price
    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    // Getter methods
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}

// Test class
public class Question2 {
    public static void main(String[] args) {
        // Create a Stock object
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Set previous closing price and current price
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // Display stock information
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: $" + stock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + stock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}