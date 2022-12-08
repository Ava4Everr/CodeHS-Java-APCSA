import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner input = new Scanner(System.in);
        //gather two doubles from the user
        System.out.println("Enter one double:");
        double double1 = input.nextDouble();
        System.out.println("Enter another double:");
        double double2 = input.nextDouble();
        //store results
        Calculator calc = new Calculator();
        calc.sum(double1, double2);
        calc.multiply(double1, double2);
        calc.divide(double1, double2);
        calc.subtract(double1, double2);
        //printing out results
        System.out.println(double1 + " + " + double2 + " = " + calc.sum(double1, double2));
        System.out.println(double1 + " - " + double2 + " = " + calc.subtract(double1, double2));
        System.out.println(double1 + " * " + double2 + " = " + calc.multiply(double1, double2));
        System.out.println(double1 + " / " + double2 + " = " + calc.divide(double1, double2));
    }
}
