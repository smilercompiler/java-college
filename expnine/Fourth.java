    import java.util.HashSet;
    import java.util.Scanner;
    
    public class Fourth {
        public static void main(String[] args) {
           
            String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
    
            HashSet<String> uniqueNames = new HashSet<>();
            for (String name : names) {
                uniqueNames.add(name);
            }
    
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a name to check if it exists: ");
            String checkName = scanner.nextLine();
    
            if (uniqueNames.contains(checkName)) {
                System.out.println(checkName + " exists in the set.");
            } else {
                System.out.println(checkName + " does not exist in the set.");
            }
    
            System.out.println("\nUnique names:");
            for (String name : uniqueNames) {
                System.out.println(name);
            }
    
            scanner.close();
        }
    }
     

