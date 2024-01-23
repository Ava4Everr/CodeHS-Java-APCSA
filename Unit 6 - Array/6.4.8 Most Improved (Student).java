public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;

    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    
    // Implement this method!
    // Returns the sum of the differences between exams
    // Example: Assume exams = {54, 67, 89, 95}
    //Improvement = (67 - 54) + (89 - 67) + (95 - 89) = 41
    public int getExamImprovement()
    {
        // your code goes here! 
        int improvement = 0;
        if (numExamsTaken == 0) return 0;
        
        for (int i = 1; i < numExamsTaken; i++) {
            improvement += exams[i] - exams[i - 1];
        }
        
        return improvement;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
