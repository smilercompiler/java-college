import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        
        System.out.println("Enter details for 3 employees:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            employees.add(new Employee(name, id, salary));
        }

        System.out.print("\nEnter Employee ID to update salary: ");
        int updateId = scanner.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.id == updateId) {
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();
                emp.setSalary(newSalary);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found!");
        }

        
        System.out.print("\nEnter Employee ID to remove: ");
        int removeId = scanner.nextInt();
        employees.removeIf(emp -> emp.id == removeId);

       
        System.out.println("\nRemaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        scanner.close();
    }
}

