public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return color + " circle with a radius of " + radius + 
            " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        // Change this!
        if (this.radius == other.radius && this.color.equals(other.color) && this.x == other.x && this.y == other.y){
            return true;
            } else{
                return false;
                }
    }
}
