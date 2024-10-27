import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddContact() {
        
        Contact contact = new Contact("David", "Brown", "3456789012", "678 Elm Street, Suite 3A");
        service.addContact(contact);
        assertEquals(contact, service.getContact(contact.getContactID())); 
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("Emma", "Carter", "2345678901", "22 Maple Avenue");
        service.addContact(contact);
        service.deleteContact(contact.getContactID()); 
        Exception exception = assertThrows(IllegalArgumentException.class, () -> service.getContact(contact.getContactID()));
        assertEquals("No contact found with ID " + contact.getContactID(), exception.getMessage());
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("Lily", "Hughes", "5678901234", "10 Birch Road");
        service.addContact(contact);

        service.updateFirstName(contact.getContactID(), "Lillian"); 
        service.updateLastName(contact.getContactID(), "Hughes"); 
        service.updatePhone(contact.getContactID(), "0987654321"); 
        service.updateAddress(contact.getContactID(), "30 Cedar St."); 

        Contact updatedContact = service.getContact(contact.getContactID());

        assertEquals("Lillian", updatedContact.getFirstName());
        assertEquals("Hughes", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("30 Cedar St.", updatedContact.getAddress());
    }
}
