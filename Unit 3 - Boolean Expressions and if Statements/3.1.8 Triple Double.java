import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score?");
        int pointsScored = input.nextInt();
        System.out.println("How many rebounds did you get?");
        int rebsGot = input.nextInt();
        System.out.println("How many assists did you have?");
        int assiGot = input.nextInt();
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean scored = pointsScored >= 10;
        boolean rebounds = rebsGot >= 10;
        boolean assists = assiGot >= 10;
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + scored);
        System.out.println("You got 10 or more rebounds: " + rebounds);
        System.out.println("You got 10 or more assists: " + assists); 
    }
}
