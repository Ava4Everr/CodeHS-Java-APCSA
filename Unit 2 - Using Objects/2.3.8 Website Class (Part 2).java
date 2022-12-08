public class Website
{
    // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    public Website(){
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain){
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain, int numPeople){
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }
    
    
    
    
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
