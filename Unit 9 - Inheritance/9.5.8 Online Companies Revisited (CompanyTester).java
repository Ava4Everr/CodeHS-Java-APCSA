import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        ArrayList<Company> list = new ArrayList<Company>();
        
        System.out.println("Please enter a company name, enter 'exit' to quit: ");
        String name = input.nextLine();
        
        while (!name.equalsIgnoreCase("exit"))
        {
            System.out.println("Is this an online comany, 'yes' or 'no': ");
            String online = input.nextLine();
            
            if(online.equalsIgnoreCase("yes"))
            {
                System.out.println("Please enter the website address: ");
                String webAddress = input.nextLine();
                
                OnlineCompany onlineComp = new OnlineCompany(name, webAddress);
                
                list.add(onlineComp);
            }
            else
            {
                System.out.println("Please enter the street address: ");
                String address = input.nextLine();
                
                System.out.println("Please enter the city address: ");
                String city = input.nextLine();
                
                System.out.println("Please enter the state address: ");
                String state = input.nextLine();
                
                Company comp1 = new Company(name, address, city, state);
                
                list.add(comp1);
            }
            System.out.println("Please enter a company name, enter 'exit' to quit: ");
            name = input.nextLine();
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + "\n");
        }
    }
}
