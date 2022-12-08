public class SquareTester
{
    public static void main(String[] args)
    {
        // Start here!
        Rectangle rect1 = new Rectangle(5.0, 8.0);
        
        Square sqr1 = new Square(7.0);
        
        System.out.println("Rectangle 1 = " + rect1);
        System.out.println("Changing Values!");
        rect1.setHeight(10.0);
        rect1.setWidth(5.0);
        System.out.println("Rectangle 1 = " + rect1);
        
        System.out.println("Square 1 = " + sqr1);
        System.out.println("Area = " + sqr1.area());
        System.out.println("Changing Values!");
        sqr1.setSideLength(10.0);
        System.out.println("Square 1 = " + sqr1);
        System.out.println("Area = " + sqr1.area());
    }
}
