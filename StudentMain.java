import StudentRecords.Student; 

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Ananya", 'A');
        Student student2 = new Student(102, "Rahul", 'B');

        System.out.println("Student 1 Details:");
        student1.displayStudentInfo();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayStudentInfo();
    }
}
