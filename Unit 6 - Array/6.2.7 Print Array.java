public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"w", "x", "y", "z"};
        printArr(arr);
    }
    
    public static void printArr(String[] arr)
    {
        int index = 0;
        // Print everything in the array on its own line
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(index + ". ");
            System.out.println(arr[i]);
            index++;
        }
    }
}
