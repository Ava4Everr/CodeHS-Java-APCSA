public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill filler = new FormFill("Karel", "The Dog");
        filler.setBirthday(5, 2012);
        filler.setEmailAddress("coolDog@email.com");
        
        System.out.println(filler.fullName());
        System.out.println(filler.birthday());
        System.out.println(filler.contactInformation());
        
    }
}
