public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acc1 = Math.random();
        double acc2 = Math.random();
        
        // Create two Racecar objects
        Racecar car1 = new Racecar(acc1, "Jake O'Brien");
        Racecar car2 = new Racecar(acc2, "Paul Smith");
        // Compute the finishing times for both cars
        double finCar1 = car1.computeTime(2414);
        double finCar2 = car2.computeTime(2414);
        // Print times of each car
        System.out.println("First car finished in " + finCar1 + " seconds");
        System.out.println("Second car finished in " + finCar2 + " seconds");
    }
}
