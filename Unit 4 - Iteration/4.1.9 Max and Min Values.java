import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or 0 to quit:");
        int userNumber = input.nextInt();
        
        int largestNumber = userNumber;
        int smallestNumber = userNumber;
        
        while (true){
            if (userNumber > largestNumber){
                largestNumber = userNumber;
                } else if(userNumber < smallestNumber){
                    smallestNumber = userNumber;
                    }
            if (userNumber == 0){
                break;
                }
            System.out.println("Results so far:");
            System.out.println("Largest number: " + largestNumber);
            System.out.println("Smallest number: " + smallestNumber);
            System.out.println("Enter a number or 0 to quit:");
            userNumber = input.nextInt();
            }
            
    }
}
