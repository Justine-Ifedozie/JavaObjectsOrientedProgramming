import main.Television.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {

    @Test
    public void TestThatTelevisionSwitchIsOn_switchIsOn(){
        Television tv = new Television();
        assertFalse(tv.isOn());

        tv.toggle();
        assertTrue(tv.isOn());

        tv.toggle();

        assertFalse(tv.isOn());

    }
}
