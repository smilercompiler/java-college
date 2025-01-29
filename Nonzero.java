import java.util.Scanner;
public class Nonzero {
     public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an array of size n
        int[] nums = new int[n];

        // Take array elements as input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the function to move 0's to the end
        moveZeroes(nums);

        // Output the result
        System.out.print("Array after moving 0's to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Function to move 0's to the end
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}


