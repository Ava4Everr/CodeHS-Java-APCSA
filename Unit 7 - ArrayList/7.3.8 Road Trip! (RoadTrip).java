import java.util.ArrayList;

public class RoadTrip
{
    ArrayList<GeoLocation> trip;
    
    public RoadTrip()
    {
        trip = new ArrayList<GeoLocation>();
    }
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation thisStop = new GeoLocation(name, latitude, longitude);
        trip.add(thisStop);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return trip.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double theMiles = 0;
        for (int i = 0; i < trip.size() - 1; i++)
        {
            double thisLeg = trip.get(i).distanceFrom(trip.get(i + 1));
            theMiles += thisLeg;
        }
        return theMiles;
    }
    
    // Return a formatted toString of the trip
    public String toString()
    {
        String thisTrip = "";
        for (int i = 0; i < trip.size(); i++)
        {
            thisTrip += (i + 1) + ". " + trip.get(i) + "\n";
        }
        return thisTrip;
    }
}
