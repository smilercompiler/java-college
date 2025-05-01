

 public class Cuboid7 extends Solid {
    public double length, width, height;

   
    public Cuboid7(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }
}
