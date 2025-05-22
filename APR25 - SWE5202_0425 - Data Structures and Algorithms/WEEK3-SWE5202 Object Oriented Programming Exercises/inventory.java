public class Inventory {
    String productName;
    int quantity;
    double price;

    public Inventory(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void ProductDetails() {
        System.out.println("Product: " + productName + ", Quantity: " + quantity + ", Price: $" + price);
    }

    public void Invoice() {
        double total = quantity * price;
        System.out.println("Invoice Total: $" + total);
    }

    public void StockDetails() {
        System.out.println("Stock available: " + quantity + " units of " + productName);
    }

    public void displayProd() {
        ProductDetails();
    }

    public static void main(String[] args) {
        Inventory item = new Inventory("Keyboard", 10, 25.5);
        item.displayProd();
        item.Invoice();
        item.StockDetails();
    }
}