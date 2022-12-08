import java.util.ArrayList;

public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        ArrayList<Double> prices = new ArrayList<Double>();
        
        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);
        
        
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(prices);
        ArrayListMethods.print(prices);
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(prices);
        ArrayListMethods.print(prices);
        
    }
}
