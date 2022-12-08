import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here
    private double length;
    private double width;
    private double height;
    private double heightSW;
    private double heightSL;
    
    public Pyramid(String name, double length, double width, double height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
        this.heightSW = Math.pow(Math.pow(height, 2) + Math.pow(length /2, 2), 0.5);
        this.heightSL = Math.pow(Math.pow(height, 2) + Math.pow(width /2, 2), 0.5);
    }
    
    public double volume()
    {
        return length * width * height /3;
    }
    
    public double surfaceArea()
    {
        return length * width + heightSW * width + heightSL * length;
    }
}
