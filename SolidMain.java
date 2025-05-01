public class SolidMain 
{
    public static void main(String[] args) {
        Cuboid7 cuboid = new Cuboid7(12, 13, 14);
        Sphere7 sphere = new Sphere7(2.4);
        System.out.println("Volume of cuboid is : "+ cuboid.calculateVolume());
        System.out.println("Volume of sphere is : "+ sphere.calculateVolume());
        

    }
    
}
