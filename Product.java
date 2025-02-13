class Product {
    private static int totalProducts = 0;
    private int productId;
    private String productName;
    private String category;
    private double price;

    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.category = "Unknown";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) {
        double discountedPrice = price * (1 - discountRate / 100);
        return discountedPrice * quantity;
    }
}

