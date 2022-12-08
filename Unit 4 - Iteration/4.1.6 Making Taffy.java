import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here
       Scanner input = new Scanner(System.in);
       System.out.println("Starting Taffy Timer...");
       
       while(true){
           System.out.println("Enter the temperature:");
           int temp = input.nextInt();
           
           if (temp >= 270){
               System.out.println("Your taffy is ready for the next step!");
               break;
               }else if (temp < 270){
                   System.out.println("The mixture isn't ready yet.");
                   }
           }
    }
}
