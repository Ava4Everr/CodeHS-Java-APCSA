import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word:");
        String userWord = input.nextLine();

        System.out.println("Enter the letter to be replaced:");
        String replLetter = input.nextLine();

        System.out.println("Enter the new letter:");
        String newLetter = input.nextLine();

        // Call the method replaceLetter and pass all 3 of these items to it for
        // string processing.
        System.out.println(replaceLetter(userWord, replLetter, newLetter));
    }

    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace
    //
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replacementLetter)
    {
        boolean found = false;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.substring(i, i + 1).equals(letterToReplace) && !found)
            {
                found = true;
            }
            else if (word.substring(i, i + 1).equals(letterToReplace) && found)
            {
                word = word.substring(0, i) + replacementLetter + word.substring(i+1);

            }
        }
        return word;
    }
}
