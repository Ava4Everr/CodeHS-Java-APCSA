public class Routine
{
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;
    
    public Routine()
    {
        school = 0;
        sleep = 0;
        friends = 0;
        hobbies = 0;
    }
    
    public double getSchool() {return school;}
    public double getSleep() {return sleep;}
    public double getFriends() {return friends;}
    public double getHobbies() {return hobbies;}
    
    public void setSchool(double newSchool)
    {
        school = newSchool;
    }
    public void setSleep(double newSleep)
    {
        sleep = newSleep;
    }
    public void setFriends(double newFriends)
    {
        friends = newFriends;
    }
    public void setHobbies(double newHobbies)
    {
        hobbies = newHobbies;
    }
    
    public void printTotal()
    {
        double schoolWeek = (school * 7);
        double sleepWeek = (sleep * 7);
        double friendWeek = (friends * 7);
        double hobbieWeek = (hobbies * 7);
        double total = schoolWeek + sleepWeek + friendWeek + hobbieWeek;
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + schoolWeek);
        System.out.println("Sleeping: " + sleepWeek);
        System.out.println("With Friends: " + friendWeek);
        System.out.println("Doing fun stuff: " +  hobbieWeek);
        System.out.println("You're busy " + total + " hours a week!");
    }
}
