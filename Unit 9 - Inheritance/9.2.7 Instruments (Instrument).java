public class Instrument
{
    protected String name;
    protected String family;
    
    public Instrument(String name, String family)
    {
        this.name = name;
        this.family = family;
    }
    
    public Instrument(String name)
    {
        this.name = name;
        this.family = "Strings";
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getFamily()
    {
        return this.family;
    }
    
    public void setFamily(String family)
    {
        this.family = family;
    }
    
    public String toString()
    {
        return name + " is a member of the " + family + " family.";
    }
}
