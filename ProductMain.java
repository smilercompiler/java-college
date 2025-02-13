
    public class ProductMain {
        public static void main(String[] args) {
            Product p1 = new Product();
            Product p2 = new Product(101, "Laptop", "Electronics", 75000);
            Product p3 = new Product(102, "Table", "Furniture", 5000);
            
            Product.displayTotalProducts();
    
            p1.displayProductInfo();
            System.out.println("Stock Value (10 units): " + p1.calculateStockValue(10));
            
            p2.displayProductInfo();
            System.out.println("Stock Value (5 units, 10% discount): " + p2.calculateStockValue(5, 10));
            
            p3.displayProductInfo();
            System.out.println("Stock Value (3 units): " + p3.calculateStockValue(3));
        }
    }
    

