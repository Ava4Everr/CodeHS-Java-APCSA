import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        // Start by importing your code from the previous exercise
        Scanner input = new Scanner(System.in);
        //Destination Options
        System.out.println("Destination Options: New Zealand or Switzerland");
        String uDestination = input.nextLine();
        if (uDestination.toLowerCase().equals("new zealand"))
        {
            System.out.println("Activty 1: Skydiving");
            System.out.println("Activity 2: Nature Hike");
            System.out.println("Activity 3: Star Gazing");
            System.out.println("Activity 4: Rafting");
            System.out.println("Enter the activity(by it's number you would like to do:");
            String activity = input.nextLine();
            if (activity.equals("1"))
            {
                System.out.println("Have fun Skydiving!");
            }
            else if (activity.equals("2"))
            {
                System.out.println("Have fun on your Nature Hike!");
            }
            else if (activity.equals("3"))
            {
                System.out.println("Have fun Star Gazing!");
            }
            else if (activity.equals("4"))
            {
                System.out.println("Have fun Rafting!");
            }
        }
        if (uDestination.toLowerCase().equals("switzerland"))
        {
            System.out.println("Activty 1: Boat Trip");
            System.out.println("Activity 2: Bungee Jumping");
            System.out.println("Activity 3: Cheese Tasting");
            System.out.println("Activity 4: SolarBob");
            System.out.println("Enter the activity(by it's number you would like to do:");
            String activity = input.nextLine();
            
            if (activity.equals("1"))
            {
                System.out.println("Have fun on your Boat Trip!");
            }
            else if (activity.equals("2"))
            {
                System.out.println("Have fun Bungee Jumping!");
            }
            else if (activity.equals("3"))
            {
                System.out.println("Have fun Cheese Tasting!");
            }
            else if (activity.equals("4"))
            {
                System.out.println("Have fun on the Solar Bob!");
            }
   
        }

    }
}
