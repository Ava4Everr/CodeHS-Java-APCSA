//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        int randInteger1 = (int)(Math.random()*(11)+ 1);
        while (randInteger1 > 10 || randInteger1 < 1)
        {
            randInteger1 = (int)(Math.random()*(11)+ 1);
        }
        return randInteger1;
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        int randInteger2 = (int)(Math.random()*(max + 1) + min);
        while (randInteger2 > max || randInteger2 < min)
        {
            randInteger2 = (int)(Math.random()*(max + 1) + min);
        }
        return randInteger2;
    }
}
