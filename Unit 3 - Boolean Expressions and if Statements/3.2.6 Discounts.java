import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Ask how many hours were you parked
        System.out.println("How many hours were you parked?");
        int hrsParked = input.nextInt();
        // Compute cost - $4.25
        double cost = hrsParked * 4.25;
        // If parked for more than 3 hours, apply 25% discount
        if (hrsParked > 3){
            double subtracting = cost * 0.25;
            cost = cost - subtracting;
        }
        // If cost is under $7, set cost to $7
        else if (cost < 7){
            cost = 7;
            }
        // Display the final cost
        System.out.println("You owe $" + cost);
    }
}
