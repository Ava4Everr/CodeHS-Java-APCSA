import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //user input
        System.out.println("Enter the dividend:");
        int dividend = input.nextInt();
        System.out.println(" Enter the divisor:");
        int divisor = input.nextInt();
        //if statement
        if (divisor == 0){
            System.out.println(" " + dividend + " is not divisible by 0!");
            } else if(dividend % divisor == 0){
                System.out.println(" " + dividend + " is divisible by " + divisor + "!");
            } else{
                System.out.println(" " + dividend + " is not divisible by " + divisor + "!");
                }
    }
}
