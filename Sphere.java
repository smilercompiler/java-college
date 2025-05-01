public class Sphere extends Solid {
    int r;
    final double pi = 3.14;
    public Sphere(int r)
    {
this.r = r;
    }
    @Override
    double calculateVolume() {
        
        return (4/3)*pi*r*r*r;
       
    }
}
