- a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
     Print a Stock Report with total value of each Stock and the total value of Stock.
- b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
- c. Logic -> Calculate the value of each stock and the total value
- d. O/P -> Print the Stock Report.
- e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read from the input file. Have functions in the Class to calculate the value of each stock and the value of total stocks
```java
import java.util.ArrayList;
import java.util.Scanner;

// Class representing an individual stock
class Stock {
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    // Constructor to initialize stock details
    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    // Method to calculate the value of the stock
    public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
}

// Class managing a collection of stocks
class StockPortfolio {
    private ArrayList<Stock> stocks; // ArrayList to hold stocks

    // Constructor to initialize the ArrayList
    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    // Method to add a stock to the portfolio
    public void addStock(String stockName, int numberOfShares, double sharePrice) {
        stocks.add(new Stock(stockName, numberOfShares, sharePrice)); // Create a Stock object and add to ArrayList
    }

    // Method to display the stock report
    public void displayStockReport() {
        double totalPortfolioValue = 0.0; // Variable to calculate total portfolio value

        for (Stock stock : stocks) { // Loop through each stock in the ArrayList
            double stockValue = stock.calculateStockValue(); // Calculate value of each stock
            totalPortfolioValue += stockValue; // Add stock value to total portfolio value

            // Display details of each stock
            System.out.println("Stock: " + stock.stockName);
            System.out.println("Number of Shares: " + stock.numberOfShares);
            System.out.println("Share Price: $" + stock.sharePrice);
            System.out.println("Total Value of Stock: $" + stockValue);
            System.out.println();
        }

        // Display total portfolio value
        System.out.println("Total Portfolio Value: $" + totalPortfolioValue);
    }
}

// Main class to run the program
public class StockReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
        StockPortfolio portfolio = new StockPortfolio(); // Create StockPortfolio object

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt(); // Read number of stocks from user

        // Loop to input details for each stock
        for (int i = 1; i <= numStocks; i++) {
            System.out.println("\nEnter details for Stock " + i + ":");
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Stock Name: ");
            String stockName = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter Share Price: $");
            double sharePrice = scanner.nextDouble();

            portfolio.addStock(stockName, numberOfShares, sharePrice); // Add stock details to portfolio
        }

        System.out.println("\nStock Report:");
        portfolio.displayStockReport(); // Display the stock report

        scanner.close(); // Close the scanner object
    }
}
