public class Car7 implements Vehicle7 {
    public double fuelLevel;

    public Car7(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}
