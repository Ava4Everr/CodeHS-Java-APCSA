public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String theName, int theCalories)
        {
            name = theName;
            calories = theCalories;
        }
        
        //Add getter and setter methods for calories
        public int getCalories()
        {
            return calories;
        }
        public void setCalories(int newCalories)
        {
            calories = newCalories;
        }
        
        //Add getter and setter methods for name
        public String getName()
        {
            return name;
        }
        public void setName(String newName)
        {
            name = newName;
        }
        
        //Add toString method
        public String toString()
        {
            return name + " have " + calories + " calories.";
        }
}
