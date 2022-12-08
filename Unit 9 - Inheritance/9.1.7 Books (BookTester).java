public class BookTester
{
    public static void main(String[] args)
    {
        Mystery oneIsLying = new Mystery();
        
        oneIsLying.setPages(374);
        oneIsLying.setTitle("One of Us Is Lying");
        oneIsLying.setAuthor("Karen M. McManu");
        oneIsLying.setSubgenre("Crime Mystery");
        
        
        Encyclopedia britannica = new Encyclopedia();
        britannica.setPages(1009);
        britannica.setTitle("Original Encyclopedia Britannica, Vol. 3");
        britannica.setArticles(30);
        britannica.setStartLetter("C");
        britannica.setEndLetter("L");
        
        
        System.out.println(oneIsLying.getTitle());
        System.out.println(britannica.getTitle());
    }
}
