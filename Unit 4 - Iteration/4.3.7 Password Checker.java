import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your password:");
        String userPassword = input.nextLine();
        
        System.out.println(passwordCheck(userPassword));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        String digitList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if(password.length() < 8){
            return false;
            }
        for (int i = 0; i < password.length(); i++){
            String letter = password.substring(i, i+1);
            System.out.println("letter");
            if (digitList.indexOf(letter) < 0){
                return false;
                }
            }
        return true;
    }
}
