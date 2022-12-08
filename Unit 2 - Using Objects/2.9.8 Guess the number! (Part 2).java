public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the quotient
    // max / number
    public Integer maxQuotient(Integer number)
    {
        return max / number;
    }

    // Returns the quotient
    // min / number
    public Integer minQuotient(Integer number)
    {
        return min / number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
