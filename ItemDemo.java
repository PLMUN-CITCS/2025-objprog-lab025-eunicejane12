// Define the Item class
class Item {
    // Static variable to keep track of the number of objects created
    static int objectCount = 0;

    // Instance variable for item name
    String itemName;

    // Constructor to initialize itemName and increment the objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment static objectCount whenever a new Item is created
    }

    // Static method to display the total object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

// Main class to run the program
public class ItemDemo {
    public static void main(String[] args) {
        // Create three objects of the Item class
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Call displayItem() on each item object to display the item name
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Call the static method displayObjectCount() using the class name
        Item.displayObjectCount();
    }
}
