import main.AirConditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {

    @Test
    public void testThatIHaveAnAirConditioner_AirConditionerIsOff(){
        AirConditioner AC = new AirConditioner("off", 20);
        assertEquals("off", AC.getStatus());

        AC.setStatus("on");
        assertEquals("on", AC.getStatus());
    }

    @Test
    public void whenITurnOffAirConditioner_AirConditionerIsOff(){
        AirConditioner AC = new AirConditioner("off", 20);
        AC.setStatus("on");
        assertEquals("on", AC.getStatus());

        AC.setStatus("off");
        assertEquals("off", AC.getStatus());
    }

    @Test
    public void whenIIncreaseAirConditionerTemperature_temperatureIsIncreased(){
        AirConditioner AC = new AirConditioner("off", 20);
        assertEquals(20, AC.getTemperature());

        AC.setTemperature(23);
        assertEquals(23, AC.getTemperature());
    }

    @Test
    public void whenIDecreaseAirConditionerTemperature_temperatureIsDecreased(){
        AirConditioner AC = new AirConditioner("off", 20);
        assertEquals(20, AC.getTemperature());

        AC.setTemperature(19);
        assertEquals(19, AC.getTemperature());
    }
    @Test
    public void whenIIncreaseAirConditionerTemperatureBeyond30_temperatureIsStill30(){
        AirConditioner AC = new AirConditioner("off", 20);
        assertEquals(20, AC.getTemperature());

        AC.setTemperature(32);
        assertEquals(30, AC.getTemperature());
    }

    @Test
    public void whenIDecreaseAirConditionerTemperatureBelow16_temperatureIsStill16(){
        AirConditioner AC = new AirConditioner("off", 20);
        assertEquals(20, AC.getTemperature());

        AC.setTemperature(15);
        assertEquals(16, AC.getTemperature());
    }
}
