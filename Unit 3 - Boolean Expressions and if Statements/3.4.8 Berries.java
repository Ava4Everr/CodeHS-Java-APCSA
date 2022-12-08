import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for a berry 
        System.out.println("Enter the initial of the berry:");
        String initial = input.nextLine();
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using == 
        char initialChar = initial.charAt(0);
        // Use comments to list the different
        // branches you will need before you write the code
        if (initialChar == 'E'){
            System.out.println("You ordered Elderberry");
            } else if (initialChar == 'G'){
                System.out.println("You ordered Gooseberry");
                } else if (initialChar == 'L'){
                    System.out.println("You ordered Lingonberry");
                    } else{
                        System.out.println("Berry not recognized");
                        }
    }
}
