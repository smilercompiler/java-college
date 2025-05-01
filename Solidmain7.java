public class Solidmain7 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5, 3, 2);
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());

        Sphere sphere = new Sphere(4);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }
}
