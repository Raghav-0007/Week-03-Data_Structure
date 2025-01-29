package singlylinkedlist.inventorymanagementsystem;

class Inventory {
    private Item head;

    // Add item at the beginning
    public void addAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at the end
    public void addAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Remove item by ID
    public void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head, prev = null;
        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) prev.next = temp.next;
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID
    public Item searchByID(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Calculate total inventory value
    public double calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        return total;
    }

    // Sort inventory using Merge Sort
    public void sortInventory(boolean sortByName, boolean ascending) {
        head = mergeSort(head, sortByName, ascending);
    }

    private Item mergeSort(Item head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, sortByName, ascending);
        Item right = mergeSort(nextOfMiddle, sortByName, ascending);

        return merge(left, right, sortByName, ascending);
    }

    private Item merge(Item left, Item right, boolean sortByName, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (sortByName)
            condition = (ascending) ? left.name.compareToIgnoreCase(right.name) < 0 : left.name.compareToIgnoreCase(right.name) > 0;
        else
            condition = (ascending) ? left.price < right.price : left.price > right.price;

        if (condition) {
            left.next = merge(left.next, right, sortByName, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, sortByName, ascending);
            return right;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display inventory
    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

