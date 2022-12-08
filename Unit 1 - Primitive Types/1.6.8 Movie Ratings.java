import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal): ");
        double movieRating = input.nextDouble();
        System.out.println(movieRating);
        double roundRating = movieRating + 0.5;
        int intRating = (int)roundRating;
        System.out.println("Rating rounded: " + intRating);
    }
}
