import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        //Asking user for doubles
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one double:");
        double double1 = input.nextDouble();
        System.out.println("Enter a second double:");
        double double2 = input.nextDouble();
        //Setting up the calculator
        Calculator calc = new Calculator();
        //Calling the methods
        calc.sum(double1, double2);
        calc.multiply(double1, double2);
        calc.divide(double1, double2);
        calc.subtract(double1, double2);
        
    }
}
