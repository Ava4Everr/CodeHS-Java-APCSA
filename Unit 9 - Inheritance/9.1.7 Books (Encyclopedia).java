public class Encyclopedia extends Book
{
    private int articles;
    private String startLetter;
    private String endLetter;
    
    
    
    public int getArticles(){
        return articles;
    }
    
    public void setArticles(int numArticles){
        articles = numArticles;
    }
    
    public String getStartLetter(){
        return startLetter;
    }
    
    public void setStartLetter(String startLetter){
        this.startLetter = startLetter;
    }
    
    public String getEndLetter(){
        return endLetter;
    }
    
    public void setEndLetter(String endLetter){
        this.endLetter = endLetter;
    }
}
