public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int number)
    {
        while (number > 0){
            System.out.println(number % 10);
            number = number / 10;
        }
    }
}
