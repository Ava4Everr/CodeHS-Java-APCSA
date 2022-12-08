import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        //ask user for their names
        System.out.println("Enter player one's name:");
        String player1 = input.nextLine();
        System.out.println("Enter player two's name:");
        String player2 = input.nextLine();
        //ask user for player score
        System.out.println("Enter " + player1 + " score:");
        int player1Score = input.nextInt();
        System.out.println("Enter " + player2 + " score:");
        int player2Score = input.nextInt();
        //organize alphabetically 
        int compare = player1.compareTo(player2);
        //if statements to allow the print statements to come out alphabetically
        if (compare < 0){
            System.out.println(player1 + " scored " + player1Score + " points");
            System.out.println(player2 + " scored " + player2Score + " points");
            }else{
                System.out.println(player2 + " scored " + player2Score + " points");
                System.out.println(player1 + " scored " + player1Score + " points");
                }
        if (player1Score > player2Score){
            System.out.println(player1 + " wins!");
            } else if (player2Score > player1Score){
                System.out.println(player2 + " wins!");
                } else{
                    System.out.println(player1 + " " + player1 + " tie!");
                }
    }
}
