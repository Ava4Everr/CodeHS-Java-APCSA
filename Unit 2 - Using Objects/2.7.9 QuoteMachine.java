import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a quote
        // Ask for the author
        System.out.println("Enter a quote:");
        String userQuote = input.nextLine();
        System.out.println("Enter the author of the quote:");
        String authQuote = input.nextLine();
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        String usQuote = "\"" + userQuote + "\"";
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
        System.out.println(usQuote + "\n" + authQuote);
    }
}
