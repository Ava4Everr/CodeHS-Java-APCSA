import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        sortContacts();
    }

    public void sortContacts() {
        Collections.sort(contacts, (contact1, contact2) -> contact1.getName().compareTo(contact2.getName()));
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void printPhonebook() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName());
        }
    }
}
