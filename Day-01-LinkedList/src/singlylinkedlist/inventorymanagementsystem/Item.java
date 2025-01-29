package singlylinkedlist.inventorymanagementsystem;

class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

