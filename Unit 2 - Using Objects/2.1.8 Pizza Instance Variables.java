public class PizzaTester
{
    public static void main(String[] args)
    {
        System.out.println("You should be able to run this");
        System.out.println("if you added the instance variables correctly");
        
    }
    private String toppings;
    private String cheese;
    private int size;
    private boolean tomatoSauce;
    private int slices;
    
    public PizzaTester(String t, String c, int s, boolean ts, int sl){
        toppings = t;
        cheese = c;
        size = s;
        tomatoSauce = ts;
        slices = sl;
    }
}
