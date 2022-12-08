import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
    public static ArrayList<Double> condense(ArrayList<Double> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            array.set(i, array.get(i)*array.get(i + 1));
            array.remove(i + 1);
        }
        return array;
    }
    public static ArrayList<Double> duplicate(ArrayList<Double> arr)
    {
        ArrayList<Double> temp = new ArrayList<Double>();
        for (int i = 0; i < arr.size(); i++)
        {
            temp.add(arr.get(i));
        }
        arr.addAll(temp);
        return arr;
    }
}
