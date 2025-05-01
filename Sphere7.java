public class Sphere7 extends Solid {
    public double radius;

    
    public Sphere7(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}