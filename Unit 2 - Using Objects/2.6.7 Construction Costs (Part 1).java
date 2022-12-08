import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        //Getting tax rate
        System.out.println("Enter the sales tax rate:");
        double taxRate = input.nextDouble();
        //Getting amount of boards needed
        System.out.println("How many boards do you need?");
        int amtBoards = input.nextInt();
        //Getting amount of windows needed
        System.out.println("How many windows do you need?");
        int amtWindows = input.nextInt();
        //
        Construction prices = new Construction(8, 11, taxRate);
        double total = prices.lumberCost(amtBoards)  + prices.windowCost(amtWindows);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + prices.grandTotal(total));
    }
}
