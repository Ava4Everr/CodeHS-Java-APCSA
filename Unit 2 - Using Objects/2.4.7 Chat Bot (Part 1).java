import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        Bot name1 = new Bot(name);
        name1.greeting();
        name1.help();
        System.out.println("Tell me Bot, which countries use the imperial system?");
        name1.imperialCountries();
        System.out.println("Tell me Bot, what was the first computer bug?");
        name1.firstBug();
        name1.goodbye();
    }
}
