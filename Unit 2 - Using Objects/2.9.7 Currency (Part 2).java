import java.lang.Math;

public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        double dubVal = value.doubleValue();
        int intVal = (int) dubVal;
        return intVal;
    }
    //Returns the cents portion of value
    //as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        int cents = (int)(value * 100) % 100;
        return cents;
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}
