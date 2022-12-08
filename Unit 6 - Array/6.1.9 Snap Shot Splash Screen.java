public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] splashScreen = {"Welcome", "to", "the snap shot", "app!"};
        for (String word: splashScreen)
        {
            System.out.println(word);
        }
        splashScreen[0] = "Upgrade";
        splashScreen[3] = "premium app!";
        
        System.out.println();
        
        for (String word: splashScreen)
        {
            System.out.println(word);
        }
    }
}
