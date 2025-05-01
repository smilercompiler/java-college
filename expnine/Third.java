import java.util.HashMap;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> inventory = new HashMap<>();

        System.out.println("Enter details for 3 products:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Product ID: ");
            int productId = scanner.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            inventory.put(productId, quantity);
        }
       
        System.out.print("\nEnter Product ID to update quantity: ");
        int updateId = scanner.nextInt();
        if (inventory.containsKey(updateId)) {
            System.out.print("Enter new quantity: ");
            int newQuantity = scanner.nextInt();
            inventory.put(updateId, newQuantity);
        } else {
            System.out.println("Product not found!");
        }

        System.out.print("\nEnter Product ID to remove: ");
        int removeId = scanner.nextInt();
        if (inventory.containsKey(removeId)) {
            inventory.remove(removeId);
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found!");
        }

        System.out.println("\nFinal Inventory:");
        for (var entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        scanner.close();
    }
}
