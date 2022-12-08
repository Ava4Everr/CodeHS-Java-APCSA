public class ClothingTester
{
    public static void main(String[] args)
    {
        // Start here!
        Jeans jean1 = new Jeans("Medium");
        TShirt tshirt1 = new TShirt("Large", "Green", "Cotton");
        Sweatshirt sweatShirt = new Sweatshirt("Extra Large", "Yellow", true);
        Jeans jean2 = new Jeans("Small");
        
        System.out.println("My Jeans are " + jean1.getSize() + " and the color " + jean1.getColor());
        System.out.println("My TShirt is size " + tshirt1.getSize() + " is the color " + tshirt1.getColor() + " and is made out of " + tshirt1.getFabric());
        System.out.println("My SweatShirt is size " + sweatShirt.getSize() + " is the color " + sweatShirt.getColor() + " and it is " + sweatShirt.hasHood() + " that it has a hood");
        System.out.println("My Jeans are " + jean2.getSize() + " and the color " + jean2.getColor());
    }
}
