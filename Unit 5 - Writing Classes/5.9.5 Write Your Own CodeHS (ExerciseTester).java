public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Iteration Iteration Iteration", "Java", 45, 5);
        
        System.out.println(exercise1.getName());
        System.out.println(exercise2.getName());
    }
}
