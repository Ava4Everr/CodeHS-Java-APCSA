import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal:");
        int goalAmount = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount:");
        int actAmount = input.nextInt();
        // Compare numbers by creating three booleans
        boolean overGoal = actAmount > goalAmount;
        boolean notGoal = actAmount < goalAmount;
        boolean gotGoal = actAmount == goalAmount;
        // Display results as instructed
        System.out.println("Went over goal? " + overGoal);
        System.out.println("Did not meet goal? " + notGoal);
        System.out.println("Met goal exactly? " + gotGoal); 
    }
}
