import java.util.Arrays;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new  int[max];
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
		int i = 2;
		while (i != max)
		{
		    sequence[i] = sequence[i-1] + sequence[i-2]; 
		    i++;
		}
		//print the Fibonacci sequence numbers
		System.out.println("The first 15 elements in the Fiboncacci sequence are:");
		
		System.out.println(Arrays.toString(sequence).replace("[", "").replace("]", "").replace(",", ""));
		
        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));
    
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {    
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == toFind)
            {
                return arr[i+1];
            }
        }
        return -1;
    }
}
