public class Comment
{
    private String poster;
    private String text;
    private String date;
    
    public Comment(String personPosting, String message, String commentDate)
    {
        poster = personPosting;
        text = message;
        date = commentDate;
    }
    
    public String getPoster() {return poster;}
    
    public String getComment() {return text;}
    
    public String getDate() {return date;}
    
    public String toString()
    {
        return text + "\n--" + poster + "(" + date + ")";
    }
}
