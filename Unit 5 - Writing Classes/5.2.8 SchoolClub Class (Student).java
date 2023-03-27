public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
    
    public Student(String first, String last, int grade, String sName){
        firstName = first;
        lastName = last;
        gradeLevel = grade;
        school = sName;
    }
    
    public Student(String first, String last, int grade){
        firstName = first;
        lastName = last;
        gradeLevel = grade;
        if (grade <= 12 && grade >= 9) {
            school = "high school";
        } else if (grade <= 8 && grade >= 6) {
            school = "middle school";
        } else {
            school = "elementary school";
        }
    }
   
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}