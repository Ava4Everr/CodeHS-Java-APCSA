public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{42, 14, 54, 5, 93, 5},
                        {14, 22, 353, 341, 865, 32},
                        {12345, 123, 1234, 123456, 23, 1}};
        System.out.println(sumArray(array));
    }
    
    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0; 
        for (int i = 0; i < array[row].length; i++)
        {
            sum += array[row][i];
        }
        return sum;
    }
    
    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
