public class ActivityLog
{
    private double numHours;
    private double numMiles;
    //contructor for all attributes in the program
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    /*this is a mutatble method that adds the amount of hours you
    logged to the total amount of hours you have logged*/
    public void addHours(double hours)
    {
        numHours += hours;
    }
    /*this is a mutable method that adds the amount of miles you
    logged to the total amount of miles that you have logged similar
    to the addHours method but with a different attribute*/
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    /*this is an accesor method that returns the amount of miles 
    you've ran*/
    public double getMiles()
    {
        return numMiles;
    }
    /*this is an accessor method that returns the amount of hours 
    you've ran*/
    public double getHours() 
    {
        return numHours;
    }
    
}
