public class Meal
{
    private String name;
    private String meal;
    private int numServings;
    
    public Meal(String theName, String mealUnder, int numOfServings)
    {
        name = theName;
        meal = mealUnder;
        numServings = numOfServings;
    }
    
    public String getTheName() 
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getCourse() {return meal;}
    
    public int getNumberOfServings() {return numServings;}
    
    public String toString()
    {
        return name + " (" + meal + ")";
    }
}
