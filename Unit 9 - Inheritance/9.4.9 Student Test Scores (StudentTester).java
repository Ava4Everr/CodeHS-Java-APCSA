import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Prompt the user for name, test scores, and service hours
        System.out.println("Please enter the student name:");
        String name = input.nextLine();
        
        System.out.println("Please enter the Math Score:");
        int mathScore = input.nextInt();
        
        System.out.println("Please enter the ELA Score:");
        int elaScore = input.nextInt();
        
        System.out.println("Please enter the Service Hours:");
        int serviceHours = input.nextInt();
        
        // Create a HSStudent object
        HSStudent stu1 = new HSStudent(name, mathScore, elaScore, serviceHours);
        // Print the results
        System.out.println("Pass Math? " + stu1.passMath());
       System.out.println("Pass ELA? " + stu1.passEla());
       System.out.println("Completed Service Hours? " + stu1.completeService());
        System.out.println(stu1);
    }
}
