public class Fruit extends HealthyFood
{
    private boolean IsInSeason;
    private String getVitamins;
    
    public Fruit(String name, int calories, String color, boolean IsInSeason, String getVitamins)
    {
        super(name, calories, color);
        this.IsInSeason = IsInSeason;
        this.getVitamins = getVitamins;
    }
    
    public boolean isInSeason()
    {
        return this.IsInSeason;
    }
    
    public void setIsInSeason(boolean IsInSeason)
    {
        this.IsInSeason = IsInSeason;
    }
    
    public String getVitamins()
    {
        return this.getVitamins;
    }
    
    public void setVitamins(String getVitamins)
    {
        this.getVitamins = getVitamins;
    }
}
