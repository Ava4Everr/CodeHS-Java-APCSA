import java.lang.Math;
public class Square extends Rectangle {

    // Call to the Rectangle constructor
    public Square(double sideLength){
        super(sideLength);
    }

    //Set both the width and height in the superclass
    public void setSideLength(double sideLength)
    {
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }
    
    // Get the width and/or the height from the superclass
    public double getSideLength()
    {
        return super.getWidth();
    }
    
    // Get the width and/or the height from the superclass
    public double area()
    {
        return getSideLength() * getSideLength();
    }
    
    public double perimeter()
    {
        return (2 * getSideLength()) + (2 * getSideLength());
    }

    // Override to read: ___ x ____ Square
    @Override
    public String toString(){
        return super.getWidth() + " x " + super.getHeight() + " Square";
    }
}
