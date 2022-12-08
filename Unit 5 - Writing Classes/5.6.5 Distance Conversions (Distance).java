public class Distance
{
    private double kilometers;
    
    public Distance(double theKilometers)
    {
        kilometers = theKilometers;
    }
    
    public double toMiles()
    {
        double miles = kilometers / 1.609;
        return miles;
    }
    
    public double toLeagues()
    {
        double leagues = kilometers / 5.556;
        return leagues;
    }
    
    public double doubleMiles()
    {
        return toMiles() * 2;
    }
    
    public double getKilometers()
    {
        return kilometers;
    }
}
