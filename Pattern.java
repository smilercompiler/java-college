import java.util.Scanner;
public class pattern {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) { 
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
        scanner.close();
    }
}

