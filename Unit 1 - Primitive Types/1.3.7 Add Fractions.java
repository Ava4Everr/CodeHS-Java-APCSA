public class AddFractions 
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 2;
        int num2 = 2;
        int den2 = 5;
        int denAdd = den1*den2;
        int myAns = num1*den2 + num2*den1;
        System.out.print("The sum of " + num1 + "/" + den1 + " + " + num2 + "/");
        System.out.println(den2 + " = " + myAns + "/" + denAdd);
    }
}
