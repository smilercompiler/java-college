package CustomerPortal; 

import ECommerce.Product; 

public class CustomerCart {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 800, 10);

        System.out.println("Accessing public method:");
        p.getProductDetails(); 

        
         p.applyDiscount(10);  // cannnot access protected method

         p.updateStock(20); // default method

        System.out.println("Profit: $" + p.calculateProfit()); // private method
    }
}
