import main.AutomaticBike.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    AutomaticBike bike;

    @BeforeEach
    public void carryThisOutFirst(){
        new AutomaticBike("off", 0);
        //assertEquals();
    }

    @Test
    public void testThatBikeCanBeTurnedOn(){
        AutomaticBike bike = new AutomaticBike("off", 0);
        assertEquals("off", bike.getBikeStatus());

        bike.setStatus("on");
        assertEquals("on", bike.getBikeStatus());
    }

    @Test
    public void testTestThatBikeCanBeTurnedOff(){
        AutomaticBike bike = new AutomaticBike("off", 0);
        bike.setStatus("on");
        assertEquals("on", bike.getBikeStatus());

        bike.setStatus("off");
        assertEquals("off", bike.getBikeStatus());
    }

    @Test
    public void testThatBikeCanBeAccelerated(){
        AutomaticBike bike = new AutomaticBike("off", 0);
        assertEquals(0, bike.getAccelerationSpeed());

        bike.setGear(1);
        assertEquals(16, bike.getAccelerationSpeed());
    }
}
