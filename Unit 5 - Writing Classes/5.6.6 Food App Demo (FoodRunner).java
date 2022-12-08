import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Food food1 = new Food("Hamburgers", 600);
        Food food2 = new Food("French Fries", 350);
        Food food3 = new Food("Coke", 200);
        
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int choice = 0;
        
        System.out.println(food1.toString());
        System.out.println("How many would you like?");
        choice = input.nextInt();
        
        total += choice * food1.getCalories();
        
        System.out.println(food2.toString());
        System.out.println("How many would you like?");
        choice = input.nextInt();
        
        total += choice * food2.getCalories();
        
        System.out.println(food3.toString());
        System.out.println("How many would you like?");
        choice = input.nextInt();
        
        total += choice * food3.getCalories();
        
        System.out.println("Your meal will have a total of " + total + " calories");
    }
}
