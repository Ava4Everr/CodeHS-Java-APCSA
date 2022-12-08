public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater company1 = new Rater("Tina's Tires", 2);
        company1.updateReview();
        company1.setRating(5);
        company1.updateReview();
        System.out.println(company1);
    }
}
