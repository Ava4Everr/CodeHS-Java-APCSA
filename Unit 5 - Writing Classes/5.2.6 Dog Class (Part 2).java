public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String theName, String theBreed, boolean allShots)
    {
        name = theName;
        breed = theBreed;
        hasShots = allShots;
    }
    public Dog(String theName, String theBreed)
    {
        name = theName;
        breed = theBreed;
        hasShots = false;
    }
    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}
