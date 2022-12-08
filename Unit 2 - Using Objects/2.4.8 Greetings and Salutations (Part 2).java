public class Salutations
{
    // Put your code here
    private String name;
    
    public Salutations(String yourName){
        name = yourName;
    }

    
    public void addressLetter(){
        System.out.print("Dear ");
        System.out.println(name);
    }
    
    public void signLetter(){
        System.out.print("Sincerely,\n");
        System.out.println(name);
    }
    
    public void addressMemo(){
        System.out.println("To whom it may concern");
    }
    
    public void signMemo(){
        System.out.print("Best,\n");
        System.out.println(name);
    }
}
