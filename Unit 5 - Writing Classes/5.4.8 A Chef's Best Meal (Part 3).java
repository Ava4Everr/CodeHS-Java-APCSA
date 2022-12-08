public class Chef
{
    private String chef;
    private String restaurant;
    private Meal bestMeal;
    
    public Chef(String chefName, String restaurantName, Meal chefBestMeal)
    {
        chef = chefName;
        restaurant = restaurantName;
        bestMeal = chefBestMeal;
    }
    
    public String getName() 
    {
        return chef;
    }
    
    public String getRestaurant() 
    {
        return restaurant;
    }
    
    public Meal getMeal() 
    {
        return bestMeal;
    }
    
    public String getMealName() 
    {
        return bestMeal.getTheName();
    }
    
    public String getMealCourse() 
    {
        return bestMeal.getCourse();
    }
    
    public int getMealServings() 
    {
        return bestMeal.getNumberOfServings();
    }
    
    public String toString()
    {
        return chef + " works at " + restaurant + " and is best known for " + bestMeal;
    }
}
