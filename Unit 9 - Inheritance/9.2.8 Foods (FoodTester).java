public class FoodTester
{
    public static void main(String[] args)
    {
        // Test each of your classes
        Food food1 = new Food("Apple", 130);
        HealthyFood food2 = new HealthyFood("Strawberry", 150, "Berry", "Red");
        Fruit food3 = new Fruit("Orange", 200, "Orange", false, "Vitamin C");
        // Make an object of each type
        // Use the getters to verify the fields are set correctly
        System.out.println(food1.getName());
        System.out.println(food2.getColor());
        System.out.println(food3.getVitamins());
        System.out.println(food1);
        System.out.println(food3.isInSeason());
    }
}
