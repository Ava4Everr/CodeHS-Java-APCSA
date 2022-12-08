import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start by making comments to outline the logic of your program
        Scanner input = new Scanner(System.in);
        //ask user how fast they ran the mile in seconds
        System.out.println("How fast did you run the mile in seconds?");
        double speed = input.nextDouble();
        //if-else statements to print and determine if user ran faster than the record
        if (speed < 223){
            System.out.println("Are you sure? That's a new world record!");
            } else if (speed >= 223){
                System.out.println("Right on! Keep running!");
                }
    }
}
