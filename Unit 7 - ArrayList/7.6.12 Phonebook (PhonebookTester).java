public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addContact(new Contact("Sherry", "Facebook", "sherrygold"));
        test.addContact(new Contact("Dylan", "Snap", "@d_oaktree"));
        test.addContact(new Contact("Kevin", "phone", "12312312"));
        test.addContact(new Contact("Bob", "phone", "12312312"));
        test.addContact(new Contact("Alex", "Tweeeter", "@alexxx"));
        test.printPhonebook();
    }
}
