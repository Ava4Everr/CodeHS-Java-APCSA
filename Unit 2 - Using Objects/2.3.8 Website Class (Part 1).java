public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website basic = new Website();
        System.out.println(basic);
        
        Website regNew = new Website("goodSchool", "edu");
        System.out.println(regNew);
        
        Website regOld = new Website("codehs", "com", 1000000);
        System.out.println(regOld);
        
    }
}
