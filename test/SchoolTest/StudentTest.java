package SchoolTest;

import main.School.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    public void testConstructorAndGetters() {
        Student student = new Student("justine22", "justine@gmail.com", "Mat456");
        assertEquals("justine22",  student.getUsername());
        assertEquals("justine@gmail.com",  student.getEmail());
    }

    @Test
    public void testMatricNoGetters() {
        Student student = new Student("justine22", "justine@gmail.com", "Mat456");
        assertEquals("Mat456", student.getMatricNo());
    }

    @Test
    public void testStudentLogin() {
        Student student = new Student("justine22", "justine@gmail.com", "Mat456");
        student.login();
    }
}
