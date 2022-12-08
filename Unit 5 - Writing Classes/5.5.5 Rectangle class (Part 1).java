public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
        Rectangle rect1 = new Rectangle(10, 4); 
        Rectangle rect2 = new Rectangle(4, 8);
        Rectangle rect3 = new Rectangle(9, 5);
        
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
        System.out.println(rect3.getArea());
        System.out.println(rect3.getPerimeter());
    }
}
