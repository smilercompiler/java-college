package ECommerce; 

public class Product {
    private String name;
    private double price;
    private int stock;
    
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void getProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock + " units");
    }

    protected void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
        System.out.println("Discount applied! New Price: $" + price);
    }


    void updateStock(int newStock) {
        this.stock = newStock;
        System.out.println("Stock updated. New stock: " + stock);
    }

    private double calculateProfit() {
        return price * 0.2; 
    }
}
