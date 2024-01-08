## Inventory Management Problem
- a. Desc -> Extend the above program to Create InventoryManager to manage the Inventory. The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. The InventoryManager will call each Inventory Object in its list to calculate the Inventory Price and then call the Inventory Object to return the JSON String. The main program will be with InventoryManager
- b. I/P -> read in JSON File
- c. Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory.
- d. O/P -> Create the JSON from Inventory Object and output the JSON String.

```java
  import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Class representing an inventory item
class Inventory {
    private String name;
    private int quantity;
    private double price;

    // Constructor to initialize inventory details
    public Inventory(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to calculate the value of the inventory
    public double calculateInventoryValue() {
        return quantity * price;
    }

    // Method to create a JSON object representing the inventory
    public JSONObject getInventoryJSON() {
        JSONObject obj = new JSONObject();
        obj.put("Name", name);
        obj.put("Quantity", quantity);
        obj.put("Price", price);
        obj.put("TotalValue", calculateInventoryValue());
        return obj;
    }
}

// Factory class to create inventory objects from JSON
class InventoryFactory {
    public static ArrayList<Inventory> getInventoryListFromJSON(String filePath) {
        ArrayList<Inventory> inventoryList = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = jsonParser.parse(reader);
            JSONArray inventoryArr = (JSONArray) obj;

            // Iterate through the JSON array to create Inventory objects
            for (Object o : inventoryArr) {
                JSONObject inventoryObj = (JSONObject) o;
                String name = (String) inventoryObj.get("Name");
                int quantity = ((Long) inventoryObj.get("Quantity")).intValue();
                double price = (double) inventoryObj.get("Price");
                inventoryList.add(new Inventory(name, quantity, price));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return inventoryList;
    }
}

// Inventory Manager class to manage inventory
class InventoryManager {
    private ArrayList<Inventory> inventoryList;

    // Constructor to initialize inventory list
    public InventoryManager(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    // Method to calculate inventory prices and return JSON strings
    public void calculateInventoryPricesAndOutputJSON() {
        for (Inventory inventory : inventoryList) {
            double totalValue = inventory.calculateInventoryValue();
            JSONObject inventoryJSON = inventory.getInventoryJSON();

            // Output inventory details in JSON format
            System.out.println("Inventory Details: " + inventoryJSON.toJSONString());
        }
    }
}

// Main class to run the inventory management system
public class InventoryManagementSystem {
    public static void main(String[] args) {
        // File path to the JSON inventory data
        String filePath = "inventory.json";

        // Create inventory list from JSON using InventoryFactory
        ArrayList<Inventory> inventoryList = InventoryFactory.getInventoryListFromJSON(filePath);

        // Create InventoryManager instance and process inventory
        InventoryManager manager = new InventoryManager(inventoryList);
        manager.calculateInventoryPricesAndOutputJSON();
    }
}
```
