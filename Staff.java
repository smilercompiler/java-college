class Staff extends Person {
    protected int staffId;
    protected String department;

    public Staff(String name, int age, String address, int staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Staff ID: " + staffId + ", Department: " + department);
    }
}