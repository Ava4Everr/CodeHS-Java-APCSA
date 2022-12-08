public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student with id # 123987, GPA: 2.56
         */
         Student student1 = new Student("Bob", 123987, 2.56);
         
         
         /**
         * Create a student athlete with id # 987456, GPA: 3.47,
         * who plays lacrosse for the varsity team 
         */
         StudentAthlete student2 = new StudentAthlete("John", 987456, 3.47, "Lacrosse", "Varisty");
         
         // Print out both objects
         System.out.println(student1.toString());
         System.out.println(student2.toString());
    }
}
