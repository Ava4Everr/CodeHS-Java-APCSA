import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String authName = myInput.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = myInput.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String publisher = myInput.nextLine();
        System.out.println("Enter the year the book was published: ");
        String publishYear = myInput.nextLine();
        System.out.println(authName + ". " + title + "."); 
        System.out.println(publisher + ", " + publishYear + ".");
    }
}
