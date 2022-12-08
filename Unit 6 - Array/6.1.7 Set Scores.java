public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 95, 82, 67, 100};
        for (int number: scores)
        {
            System.out.println(number);
        }

        scores[2] = 72;
        scores[4] = 95;
        
        System.out.println();
        
        for (int number: scores)
        {
            System.out.println(number);
        }
    }
}
