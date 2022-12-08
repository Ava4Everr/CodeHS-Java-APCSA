import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost?");
        double dinnerCost = input.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double laserTagCost = input.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double iceCreamCost = input.nextDouble();
        double totalDinnerCost = (dinnerCost * 2) + dinnerCost;
        double totalLaserTagCost = laserTagCost * 2;
        double totalIceCreamCost = (iceCreamCost / 3) + iceCreamCost;
        double totalSum = totalDinnerCost + totalLaserTagCost + totalIceCreamCost;
        System.out.println("Dinner: $" + totalDinnerCost);
        System.out.println("Laser Tag: $" + totalLaserTagCost);
        System.out.println("Ice-cream: $" + totalIceCreamCost);
        System.out.println("Grand Total: $" + totalSum);
    }
}
