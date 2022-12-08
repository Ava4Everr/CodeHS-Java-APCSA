public class EmployeeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Employee emp1 = new Employee("Bob", 78000.0);
        System.out.println(emp1);
        
        HourlyEmployee emp2 = new HourlyEmployee("Joe", 18.0, 48);
        System.out.println(emp2);
    }
}
