import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        if (user.equals(computer))
        {
            return TIE;
        }
        else if (user.equals("rock"))
        {
            if (computer.equals("scissors"))
            {
                return USER_PLAYER;
            }
            else if (computer.equals("paper"))
            {
                return COMPUTER_PLAYER;
            }
        }
        else if (user.equals("paper"))
        {
            if (computer.equals("scissors"))
            {
                return COMPUTER_PLAYER;
            }
            else if (computer.equals("rock"))
            {
                return USER_PLAYER;
            }
        }
        else if (user.equals("scissors"))
        {
            if (computer.equals("paper"))
            {
                return USER_PLAYER;
            }
            else if (computer.equals("rock"))
            {
                return COMPUTER_PLAYER;
            }
        }
        return "Invalid user input";
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
            int random = Randomizer.nextInt(1,3);
            String computerChoice = "";
            if (random == 1)
            {
                computerChoice = "rock";
            }
            else if (random == 2)
            {
                computerChoice = "paper";
            }
            else if (random == 3)
            {
                computerChoice = "scissors";
            }
            System.out.println("Enter your choice (rock, paper, scissors):");
            String userChoice = input.nextLine();
            if (userChoice.equals(""))
            {
                System.out.println("Thanks for playing");
                break;
            }
            else
            {
                System.out.println("User: " + userChoice);
                System.out.println("Computer: " + computerChoice);
                System.out.println(getWinner(userChoice.toLowerCase(), computerChoice.toLowerCase()));
            }
        }
    }
}
