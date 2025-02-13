import java.util.Scanner;
public class Nonzero {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

      
        int[] nums = new int[n];

        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        moveZeroes(nums);

        
        System.out.print("Array after moving 0's to the end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
       
        scanner.close();
    }

    
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        
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


