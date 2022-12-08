public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car1 = new Car(20,15);
        //Fill up the gas tank
        car1.addGas();
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Drive 100 miles
        car1.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Add 2 gallons to the gas tank
        car1.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + car1.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        car1.drive(1000);
        //Drive 200 miles
        car1.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + car1.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + car1.getTotalMilesDriven());

    }
}
