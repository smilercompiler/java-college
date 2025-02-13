import java.util.Scanner;

public class Major {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        
        int[] nums = new int[n];

       
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

       
        int majorityElement = majorityElement(nums);

        
        System.out.println("Majority Element: " + majorityElement);
        
        
        scanner.close();
    }

    
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}



