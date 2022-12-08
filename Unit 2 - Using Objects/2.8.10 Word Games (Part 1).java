import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word:");
        String userWord = input.nextLine();
        WordGames word = new WordGames(userWord);
        // Scramble it
        // Print out scrambled word
        System.out.println(word.scramble());
        // Ask for an index
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        // Ask for random word
        System.out.println("Enter another word: ");
        String ranWord = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(word.bananaSplit(idx, ranWord));
        
        // Ask for a character (store as a String)
        System.out.println("Enter a character:");
        String ranChar = input.nextLine();
        // Ask for random word
        System.out.println("Enter a word:");
        String ranWord2 = input.nextLine();
        // Add random word at character
        // Print out the word
        System.out.println(word.bananaSplit(ranChar, ranWord2));
    }
}
