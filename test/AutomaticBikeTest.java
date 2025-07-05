import main.AutomaticBike.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    AutomaticBike bike;

    @BeforeEach
    public void doThisFirst(){
        bike = new AutomaticBike();
        assertEquals(false, bike.getStatus());
    }

    @Test
    public void testThatWhenITurnOnMyAutomaticBike_itIsOn(){
        bike.control("on");
        assertTrue(bike.getStatus());
    }

    @Test
    public void testThatWhenITurnOffMyAutomaticBike_MyItIsOff(){
        bike.control("off");
        assertFalse(bike.getStatus());
    }

    @Test
    public void testThatWhenIAccelerateInGearOne_itIncreasesInIncrementOfOne(){
        for (int count = 0; count < 15; count++){
            bike.accelerate(bike.getGear());
        }
        assertEquals(15, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.accelerate(bike.getGear());
        assertEquals(16, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testThatWhenIAccelerateInGearTwo_itIncreasesInIncrementOfTwo(){
        bike.control("on");
        for (int count = 0; count < 22; count++){
            bike.accelerate(bike.getGear());
        }
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.accelerate(bike.getGear());
        bike.accelerate(bike.getGear());
        assertEquals(24, bike.getSpeed());

        bike.accelerate(bike.getGear());
        assertEquals(26, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }


}
