public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;  
        this.model = model;  
        this.year = year;  
    }

    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model 3", 2025);
        myCar.displayDetails();
    }
}
