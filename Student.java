class Student extends Person {
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}
