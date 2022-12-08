import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        
        
        // Use comments to organize your logic before you start coding
        //Scanner
        Scanner input = new Scanner(System.in);
        //user input
        System.out.println("Enter your password:");
        String password = input.nextLine();
        System.out.println("Enter the company's secret code:");
        String userCode = input.nextLine();
        //concatenate the user's password with company code
        String properString = password + companyCode;
        //concatenate the user's password with their code
        String userString = password + userCode;
        //comparing
        if (properString.equals(userString)){
            System.out.println("Access granted");
            } else{
                System.out.println(userString + " is denied");
                }
    }
}
