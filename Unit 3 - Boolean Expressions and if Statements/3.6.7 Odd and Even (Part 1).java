import java.util.Scanner;

public class NegativeNumbers
{
    public static void main(String[] args)
    {
        //Ask user to enter 2 positive integers
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        //Determine if both numbers are negative with bothOdd boolean
        // Do NOT remove this line!
        boolean bothNegative = num1 < 0 && num2 < 0;
        
        //ADD THE NEW LINE HERE
        boolean bothNegativeDeMorgan = (num1 < 0 || num2 < 0);
        
        //Print out if both numbers are negative or not both negative
        if (bothNegative)
        {
           System.out.println("Both numbers are negative");
        }
        else
        {
            System.out.println("Both numbers are NOT negative.");
        }
        
        //Print out if both numbers are negative or not both negative
        if (bothNegativeDeMorgan)
        {
           System.out.println("Both numbers are negative with De Morgan's Laws.");
        }
        else
        {
            System.out.println("Both numbers are NOT negative with DeMorgan's Laws.");
        }
        
        //Check that both Boolean values evaluate to the same value
        if(bothNegative == bothNegativeDeMorgan)
        {
            System.out.println("DeMorgan was right, again!");
        }
   }
}
