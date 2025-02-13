public class EmployeeTest {
    public static void main(String[] args) {
       
        Employee emp = new Employee("Rohan", 101, 50000);
        emp.display();
        emp.increaseSalary(10);
        System.out.println("After salary increase: ");
        emp.display();

        Manager mgr = new Manager("Mohan", 201, 80000, "IT");
        mgr.display();
        mgr.increaseSalary(15);
        System.out.println("After salary increase: ");
        mgr.display();
    }
}