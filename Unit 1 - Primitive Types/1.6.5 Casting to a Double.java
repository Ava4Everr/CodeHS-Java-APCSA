import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("First Int: ");
        int firstInt = myInput.nextInt();
        System.out.println("Second Int: ");
        int secInt = myInput.nextInt();
        double mySum = (double) firstInt / secInt;
        System.out.println(mySum);

    }
}
