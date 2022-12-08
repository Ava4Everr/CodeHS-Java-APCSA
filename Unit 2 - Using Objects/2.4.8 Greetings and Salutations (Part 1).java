import java.util.Scanner;

public class SalutationsTester{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        Salutations hello = new Salutations(name);
        hello.addressLetter();
        hello.signLetter();
        hello.addressMemo();
        hello.signMemo();
    }
}
