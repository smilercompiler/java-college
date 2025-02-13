class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
    }
}