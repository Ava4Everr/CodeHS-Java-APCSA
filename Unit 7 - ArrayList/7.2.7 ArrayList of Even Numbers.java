import java.util.ArrayList;

public class Evens
{
    public static void main(String[] args)
    {
        // Create the evens ArrayList
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (int i = 100; i <= 300; i+= 2)
        {
            evens.add(i);
        }
        
        printArray(evens);
    }
    
    
    //Don't alter this method! It will print your array in the console
    public static void printArray(ArrayList<Integer> array)
    {
        System.out.println("Array:");
        for(int name: array)
        {
            System.out.print(name + " ");
        }
    }
}
