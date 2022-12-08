public class Exercise
{
    public String name;
    public String programmingLanguage;
    public int points;
    public int difficulty; // scale of 1 - 5
    
    // Default constructor.
    public Exercise() 
    {
        name = "Hello World";
        programmingLanguage = "Java";
        points = 10;
        difficulty = 3;
    }
    
    // Edit code in this constructor.
    public Exercise(String name, String programmingLanguage, int points, int difficulty) 
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.points =  points;
        this.difficulty = difficulty;
    }
    
    public String getName() {
        return name;
    }
}
