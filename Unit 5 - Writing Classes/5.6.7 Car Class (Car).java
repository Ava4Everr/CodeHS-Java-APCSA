public class Car {

    // Start here
    private double efficiency;
    private double gas;
    private double tankCapactity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapactity)
    {
        efficiency = carEfficiency;
        tankCapactity = carTankCapactity;
        totalMilesDriven = 0;
    }
    
    public void addGas()
    {
        gas = tankCapactity;
        System.out.println("Filling up ...");
    }
    public void addGas(double amount)
    {
        gas += amount;
        System.out.println("Adding gas ...");
        if (gas > tankCapactity)
        {
            gas = tankCapactity;
        }
    }
    
    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }
    
    public void drive(double distance)
    {
        if (canDrive(distance))
        {
            totalMilesDriven += distance;
            double gasNeeded = distance / efficiency;
            gas -= gasNeeded;
            System.out.println("Driving " + distance);
        }
        else
        {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance)
    {
        if (distance <= milesAvailable())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double milesAvailable()
    {
        return gas * efficiency;
    }
    
    public double getGas()
    {
        return gas;
    }
}
