public class HealthyFood extends Food
{
    protected String group;
    protected String color;
    
    public HealthyFood(String name, int calories, String group, String color)
    {
        super(name, calories);
        this.group = group;
        this.color = color;
    }
    public HealthyFood(String name, int calories, String color)
    {
        super(name, calories);
        this.group = "Fruit";
        this.color = color;
    }
    
    public String getGroup()
    {
        return this.group;
    }
    
    public void setGroup(String group)
    {
        this.group = group;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
}
