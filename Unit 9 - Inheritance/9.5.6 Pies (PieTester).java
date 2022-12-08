import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        Pie pie1 = new Pie("Rubarb", 12);
        
        PecanPie pie2 = new PecanPie(8, "maple");
        
        ApplePie pie3 = new ApplePie(6);
        
        Pie[] pies = {pie1, pie2, pie3};
        
        for (int i = 0; i < pies.length; i++)
        {
            System.out.println(pies[i].getSlices() + " slices " + pies[i].getType() + "pie");
        }
    }
}
