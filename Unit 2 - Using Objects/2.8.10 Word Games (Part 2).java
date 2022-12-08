public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        String firstHalf = word.substring(0, (word.length()/2));
        String secondHalf = word.substring((word.length()/2));
        return secondHalf + firstHalf;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        
       String modString = word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
       return modString;
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int insertIdx = word.indexOf(insertChar);
        String modString = word.substring(0, insertIdx) + insertText + word.substring(insertIdx);
        return modString;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
    }
    
    
}
