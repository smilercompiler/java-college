package StudentRecords; 

public class Student {  
    private int studentId;
    private String name;
    private char grade;

    public Student(int studentId, String name, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Grade: " + this.grade);
    }
}
