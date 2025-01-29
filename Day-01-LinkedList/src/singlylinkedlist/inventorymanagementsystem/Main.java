package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding items
        inventory.addAtBeginning("Laptop", 101, 5, 750.50);
        inventory.addAtEnd("Mouse", 102, 10, 25.99);
        inventory.addAtEnd("Keyboard", 103, 7, 45.75);
        inventory.addAtBeginning("Monitor", 104, 3, 150.00);

        // Display inventory
        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        // Remove an item
        inventory.removeItem(102);
        System.out.println("\nAfter Removing Mouse:");
        inventory.displayInventory();

        // Update quantity
        inventory.updateQuantity(101, 8);
        System.out.println("\nAfter Updating Laptop Quantity:");
        inventory.displayInventory();

        // Search by ID
        System.out.println("\nSearching for Item with ID 103:");
        Item foundItem = inventory.searchByID(103);
        if (foundItem != null) System.out.println("Found: " + foundItem.name);

        // Calculate total inventory value
        System.out.println("\nTotal Inventory Value: $" + inventory.calculateTotalValue());

        // Sorting by Name (Ascending)
        inventory.sortInventory(true, true);
        System.out.println("\nSorted by Name (Ascending):");
        inventory.displayInventory();

        // Sorting by Price (Descending)
        inventory.sortInventory(false, false);
        System.out.println("\nSorted by Price (Descending):");
        inventory.displayInventory();
    }
}

