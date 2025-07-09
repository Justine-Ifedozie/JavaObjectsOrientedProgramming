package SchoolTest;

import main.School.Lecturer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LecturerTest {
    @Test
    public void testLecturerLogin() {
        Lecturer lecturer = new Lecturer("Daniels", "daniels@gmail.com", "sch234");
        lecturer.login();
    }
    @Test
    public void testConstructorAndGetters() {
        Lecturer lecturer = new Lecturer("Daniels", "daniels@gmail.com", "sch234");
        assertEquals("Daniels" ,lecturer.getUsername());
        assertEquals("daniels@gmail.com", lecturer.getEmail());
    }

    @Test
    public void testGetEmployeeID() {
        Lecturer lecturer = new Lecturer("Daniels", "daniels@gmail.com", "sch234");
        assertEquals("sch234", lecturer.getEmployeeID());
    }
}
