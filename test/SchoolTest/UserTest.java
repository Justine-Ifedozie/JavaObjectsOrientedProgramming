package SchoolTest;

import main.School.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUsername() {
        User newUser = new User("user345", "user@gmail.com");
        assertEquals("user345", newUser.getUsername());
    }

    @Test
    public void testEmail() {
        User newUser = new User("user345", "user@gmail.com");
        assertEquals("user@gmail.com", newUser.getEmail());
    }
}
