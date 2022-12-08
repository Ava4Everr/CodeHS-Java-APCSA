public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
    double total = 0;
     // your code goes here!
    for (int number: values)
    {
        total += number;
    }
    return total / values.length;
   }
}
