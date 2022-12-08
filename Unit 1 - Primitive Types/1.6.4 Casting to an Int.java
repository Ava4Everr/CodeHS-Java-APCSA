import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a double:");
        double myDouble = myInput.nextDouble();
        System.out.println(myDouble);
        int myInt = (int) myDouble;
        System.out.println(myInt);
        double newValue = myDouble + 0.5;
        System.out.println(newValue);
        int newInt = (int) newValue;
        System.out.println(newInt);
    }
}
