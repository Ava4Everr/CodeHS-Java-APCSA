import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        String thisTeam[] = new String[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++)
        {
            String thisPlayer = "";
            boolean foundOne = false;
            while(!foundOne)
            {
                System.out.println("Enter name of player to add: ");
                thisPlayer = input.nextLine();
                //check if this is a legal / available player
                int thisIndex = search(availablePlayers, thisPlayer);
                if (search(availablePlayers, thisPlayer) >= 0)
                {
                    thisTeam[i] = thisPlayer;
                    availablePlayers.remove(thisIndex);
                    foundOne = true;
                    System.out.println("Successfully added player");
                    System.out.println();
                }
                else
                {
                    System.out.println(thisPlayer + " is not an available player.");
                    System.out.println();
                }
            }
            
        }
        System.out.println("Final Team Roster: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(thisTeam[i]);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).equals(player))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
