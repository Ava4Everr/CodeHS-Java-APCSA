public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance dis1 = new Distance(5.0);
        Distance dis2 = new Distance(20.0);
        Distance dis3 = new Distance(10.0);
        // Convert one to miles, one to leagues and
        // double one mileage
        dis1.toMiles();
        dis2.toLeagues();
        dis3.doubleMiles();
        // Print out the converted values
        System.out.println(dis1.getKilometers() + " km = " + dis1.toMiles() + " miles");
        System.out.println(dis2.getKilometers() + " km = " + dis2.toLeagues() + " leagues");
        System.out.println(dis3.getKilometers() + " km (one way) = " + dis3.doubleMiles() + "miles (round trip)");
        // Use the getter!
        System.out.println(dis1.getKilometers());
    }
}
