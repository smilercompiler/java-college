import StudentRecords.Student;
public class Studentimported {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 'A');
        Student student2 = new Student(102, "Bob", 'B');
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
