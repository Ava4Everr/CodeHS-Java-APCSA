public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
        int rand = (int)(Math.random()*200);
       // Print the number of seconds
       System.out.println("Microwaving for " + rand + " seconds");
       // Use two if statements to print the temperature
       if (rand <= 120){
           System.out.println("Rolls will be the right temperature!");
           } else{
               System.out.println("Rolls will be boiling hot!");
               }
    }
}
