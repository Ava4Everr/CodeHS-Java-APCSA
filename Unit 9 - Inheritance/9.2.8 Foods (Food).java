public class Food
{
    protected String name;
    protected int calories;
    
    public Food(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getCalories()
    {
        return this.calories;
    }
    
    public void setCalories(int calories)
    {
        this.calories = calories;
    }
    
    
    public String toString()
    {
        return this.name + " has " + this.calories + " calories";
    }
}
