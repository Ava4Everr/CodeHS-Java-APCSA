import java.lang.Math;

public class Cylinder extends Solid
{
    // Code goes here
    private double radius;
    private double height;
    
    public Cylinder(String name, double radius, double height)
    {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double surfaceArea()
    {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}
