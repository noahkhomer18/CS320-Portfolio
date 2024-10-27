import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("Sarah", "Williams", "1234567890", "50 Oak Drive, Apt 12B");
        assertNotNull(contact.getContactID()); 
        assertEquals("Sarah", contact.getFirstName());
        assertEquals("Williams", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("50 Oak Drive, Apt 12B", contact.getAddress());
    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("Ben", "King", "0987654321", "90 Pine Street");
        contact.setFirstName("Benjamin");
        assertEquals("Benjamin", contact.getFirstName());
    }

    @Test
    public void testInvalidPhoneNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Anna", "Lee", "54321", "123 Main St.");
        });
        assertEquals("Phone number must be 10 digits.", exception.getMessage());
    }

    @Test
    public void testInvalidAddress() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Contact("Mark", "Taylor", "0123456789", "This address is way too long to be accepted by the system because it exceeds 30 characters.");
        });
        assertEquals("Address should be 30 characters or less.", exception.getMessage());
    }
}
