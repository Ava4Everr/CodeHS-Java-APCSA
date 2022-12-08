import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       // Start Here!
       Scanner input = new Scanner(System.in);
       //user name and greeting
       System.out.println("Hello! What is your name?");
       String name = input.nextLine();
       Bot2 userName = new Bot2(name);
       userName.greeting();
       //user's favourite animal
       System.out.println("What is your favorite animal?");
       String favAnimal = input.nextLine();
       Bot2 favAnimal1 = new Bot2(favAnimal);
       favAnimal1.favoriteAnimal(favAnimal);
       //user's dream destination
       System.out.println("If you could visit any place, where would you go?");
       String place = input.nextLine();
       Bot2 visPlace = new Bot2(place);
       visPlace.destination(place);
       //user's favourite number
       System.out.println("What is your favorite number?");
       int number = input.nextInt();
       Bot2 favNumber = new Bot2(Integer.toString(number));
       favNumber.favoriteNumber(number);
       //saying goobye to user
       userName.goodbye();
       
    }
}
