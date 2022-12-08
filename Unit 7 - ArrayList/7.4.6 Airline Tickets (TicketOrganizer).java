import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    public TicketOrganizer(ArrayList<AirlineTicket> a)
    {
        tickets = a;
    }
    
    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }
    
    public void printPassengersByBoardingGroup()
    {
        for (int i = 1; i <= 5; i++) //boarding group
        {
            System.out.println("Boarding Group " + i + ":");
            for (int j = 0; j < tickets.size(); j++)
            {
                if (tickets.get(j).getBoardingGroup() == i)
                {
                    System.out.println("Passenger " + (j + 1));
                }
            }
        }
    }
    
    public void canBoardTogether()
    {
        boolean foundOne = false;
        for (int i = 0; i < tickets.size() - 1; i++)
        {
            if (tickets.get(i).getRow() == tickets.get(i + 1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i + 1).getBoardingGroup())
            {
                System.out.println("Passenger " + (i + 1) + " can board with Passenger " + (i + 2) + ".");
                foundOne = true;
            }
        }
        if (!foundOne)
        {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }
}
