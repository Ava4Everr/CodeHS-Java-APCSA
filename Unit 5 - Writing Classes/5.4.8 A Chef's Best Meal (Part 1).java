public class ChefTester
{
    public static void main(String[] args)
    {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);
        
        System.out.println(alex);
        System.out.println(alex.getMealName());
        
        // Create your own Meal and Chef here:
        Meal frenchToast = new Meal("French Toast", "Breakfast", 6);
        Chef billy = new Chef("Billy", "Morning Sunshine", frenchToast);
        System.out.println(frenchToast);
        System.out.println(billy);
    }
}
