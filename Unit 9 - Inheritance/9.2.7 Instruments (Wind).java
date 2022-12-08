public class Wind extends Instrument
{
    private boolean reed;
    
    public Wind(String name, String family, boolean reed)
    {
        super(name, family);
        this.reed = reed;
    }
    
    public boolean getReed()
    {
        return reed;
    }
    
    public void setReed(boolean reed)
    {
        this.reed = reed;
    }
}
