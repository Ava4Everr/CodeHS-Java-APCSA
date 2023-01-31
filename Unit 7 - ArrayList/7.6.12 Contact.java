public class Contact
{
    private String name;
    private String method; 
    private String handle;

    public Contact(String name, String contactMethod, String handle)
    {
        this.name = name;
        method = contactMethod;
        this.handle = handle;
    }

    public String getName()
    {
        return name;
    }
    
    public String howToContact()
    {
        return method;
    }

    public String getHandle()
    {
        return handle;
    }
}
