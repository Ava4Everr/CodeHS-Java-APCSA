public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        int spacer = 9;
        for (int i = 0; i < 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < spacer; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            spacer--;
        }
    }
}
