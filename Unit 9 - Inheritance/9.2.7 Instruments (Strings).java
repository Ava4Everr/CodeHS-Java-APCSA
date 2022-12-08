public class Strings extends Instrument
{
    private boolean bow;
    
    public Strings(String name, boolean bow)
    {
        super(name);
        this.bow = bow;
    }
    
    public boolean getBow()
    {
        return this.bow;
    }
    
    public void setBow(boolean bow)
    {
        this.bow = bow;
    }
}
