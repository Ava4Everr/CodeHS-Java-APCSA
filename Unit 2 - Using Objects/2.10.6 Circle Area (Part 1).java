public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle cup = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + cup.getArea() + " units squared");   
        System.out.print("If this circle were this circle a sphere, ");
        System.out.println("its volume would be: " + cup.getSphereVolume() + " units cubed");      

        Circle hat = new Circle(12);
        System.out.println("\nArea of a circle with radius 12: " + hat.getArea() + " units squared");      
        System.out.print("If this circle were a sphere, ");
        System.out.println("its volume would be: " + hat.getSphereVolume() + " units cubed");     

    }
}
