import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for three ints
        System.out.println("Enter the first integer:");
        int int1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int int2 = input.nextInt();
        System.out.println("Enter the third integer:");
        int int3 = input.nextInt();
        // print out the median.
        if (int1 > int2 && int1 < int3){
            System.out.println("The median is " + int1);
            } else if (int2 > int1 && int2 < int3){
                System.out.println("The median is " + int2);
                } else if (int3 > int1 && int3 < int2){
                    System.out.println("The median is " + int3);
                    }else{
                        System.out.println("The median is " + int1);
                        }
    }
}
