public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        if (numStudentsAdded == 0) return null;
            Student improved = students[0];
        for (int i = 0; i < numStudentsAdded; i++) {
            if (improved.getExamImprovement() < students[i].getExamImprovement()) {
                improved = students[i];
        }
    }
        return improved;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
