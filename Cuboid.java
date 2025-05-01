public class Cuboid extends Solid
 {
    int l;
    int b;
    int h;
    public Cuboid(int l,int b, int h)
    {
        this.b = b;
        this.l = l;
        this.h = h;
    }
    double calculateVolume()
    {
        return l*b*h;
        
    }
}
