public class UniversityManagementSystem {
    public static void main(String[] args) {
        
        Person[] people = new Person[2];
        people[0] = new Professor("Dr. Smith", 45, "123 University St", "P123", "Computer Science", "Artificial Intelligence");
        people[1] = new GraduateStudent("Alice Johnson", 26, "456 College Ave", "S456", "M.Sc. Physics", "Quantum Computing");

       
        for (Person p : people) {
            p.displayInfo();
            System.out.println();
            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            } else if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
            System.out.println("-------------------------");
        }
    }
}