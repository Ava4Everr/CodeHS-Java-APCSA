import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the Person's name: ");
        String name = input.nextLine();
        
        System.out.println("Please enter the Person's birthday: ");
        String birthday = input.nextLine();
        
        Person per1 = new Person(name, birthday);
        
        System.out.println("Please enter the Student's name: ");
        String stuName = input.nextLine();
        
        System.out.println("Please enter the Student's birthday: ");
        String stuBirthday = input.nextLine();
        
        System.out.println("Please enter the Student's grade: ");
        int grade = input.nextInt();
        
        Student stu1 = new Student(stuName, stuBirthday, grade);
        
        System.out.println("Same: " + per1.equals(stu1));
    }
}
