import java.util.*;

public class PhoneBook {

    private List<Contact> contacts;

    public PhoneBook () {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equals(contact.getFirstName()) && c.getLastName().equals(contact.getLastName())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)) {
                return c;
            }
        }
        return null;
    }

    public Contact[] findContacts(String group) {
        List<Contact> groupContacts = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getGroup().equals(group)) {
                groupContacts.add(c);
            }
        }
        return groupContacts.isEmpty() ? null : groupContacts.toArray(new Contact[0]);
    }

    public void printContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
