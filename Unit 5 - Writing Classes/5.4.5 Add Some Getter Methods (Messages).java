public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        // Then use the accessor methods to print out the instance variables
        Comment obj1 = new Comment("Tilly", "Nice pic", "September 23rd");
        Comment obj2 = new Comment("Bobby", "Beuatiful scenery", "September 25th");
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString()); 
    }
}
