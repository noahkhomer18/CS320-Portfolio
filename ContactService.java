import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("A contact with this ID already exists. Please use a unique ID.");
        }
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact with ID " + contactID + " not found. Cannot delete.");
        }
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            throw new IllegalArgumentException("No contact found with ID " + contactID);
        }
        contact.setFirstName(firstName);
    }

    public void updateLastName(String contactID, String lastName) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            throw new IllegalArgumentException("No contact found with ID " + contactID);
        }
        contact.setLastName(lastName);
    }

    public void updatePhone(String contactID, String phone) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            throw new IllegalArgumentException("No contact found with ID " + contactID);
        }
        contact.setPhone(phone);
    }

    public void updateAddress(String contactID, String address) {
        Contact contact = contacts.get(contactID);
        if (contact == null) {
            throw new IllegalArgumentException("No contact found with ID " + contactID);
        }
        contact.setAddress(address);
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
