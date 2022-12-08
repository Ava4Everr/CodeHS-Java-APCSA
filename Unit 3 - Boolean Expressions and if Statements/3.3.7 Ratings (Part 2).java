public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    private String review; // review shown with company name 
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
        review = "";
        
    }
    
    // Set rating to newRating
    // As long as it's no more than 5
    public void setRating(double newRating)
    {
        if (newRating < 5.0){
            rating = newRating;
            } else if (newRating == 5.0) {
                rating = 5.0;
                }
    }
    
    // Updates review line based on rating
    public void updateReview()
    {
        if (rating >= 3.0){
            review = "Proudly recommended";
            } else{
                review = "Needs more ratings";
                }
    }
    
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // Uses the form
    // name: review
    public String toString()
    {
        if (rating >= 3.0){
            return name + " : " + review;
            } else{
                return name  + " : " + review;
                }
    }
}
