public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public boolean equals(Rectangle rectangle)
    {
        //return this.width == rectangle ** this.height == rectangle;
        if (this.width == rectangle.width)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        return "A rectangle with a width of " + width + " and a height of " + height;
    }
    
   
}
