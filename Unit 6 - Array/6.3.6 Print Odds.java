public class PrintOdds
{
   public static void main(String[] args)
   {
     int[ ] values = {17, 34, 56, 2, 19, 100};
        
     for (int number: values)
     {
       if (number % 2 == 1)
           System.out.println(number + " is odd");
     }
   }
}
