import main.ListMethod.ListMethod;
import main.ListMethod.ListUnderFlowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListsMethodTest {

    private ListMethod listed;

    @BeforeEach
    public void doThisBeforeEachTest(){
        listed = new ListMethod(2);
    }

    @Test
    public void TestThatNewList_isEmpty(){
        assertTrue(listed.isEmpty());
    }

    @Test
    public void pushNewElementIntoList_listIsNotEmptyTest(){
        listed.add("Justine");
        assertFalse(listed.isEmpty());
    }

    @Test
    public void addOneRemoveOne_listIsEmpty(){
        listed.add("Happy");
        assertFalse(listed.isEmpty());

        listed.remove(0);
        assertTrue(listed.isEmpty());
    }

    @Test
    public void addTwiceRemoveThreeTimes_listIsEmpty_shouldThrowException(){
        listed.add("Happy");
        listed.add("Justine");
        assertFalse(listed.isEmpty());

        listed.remove(0);
        listed.remove(1);
        assertTrue(listed.isEmpty());
        assertThrows(ListUnderFlowException.class, () -> listed.remove(2));
    }


    @Test
    public void addTwiceRemoveTwice_listIsEmpty(){
        listed.add("Happy");
        listed.add("Justine");
        assertFalse(listed.isEmpty());

        listed.remove(0);
        listed.remove(1);
        assertTrue(listed.isEmpty());
    }

    @Test
    public void addThreeElementsRemoveThreeElementsGradually_removeShouldReturnTheThreeElementsGradually(){
        listed.add("Happy");
        listed.add("Justine");
        listed.add("Jay");

        assertEquals("Justine", listed.remove(1));
        assertEquals("Jay", listed.remove(1));
        assertEquals("Happy", listed.remove(0));
    }

    @Test
    public void setArrayToLengthOne_addMoreThanOneElement_testThatListCanIncreaseInSize(){
        listed.add("Happy");
        listed.add("Justine");
        assertEquals(2, listed.getLength());
        listed.add("Jay");
        listed.add("Abbey");
        assertEquals(4, listed.getLength());
    }

    @Test
    public void addThreeElements_removeFromTheListUsingElement(){
        listed.add("Happy");
        listed.add("Justine");
        listed.add("Jay");

        assertTrue(listed.remove1("Happy"));
    }

    @Test
    public void addThreeElements_getTheElementAtAParticularIndex(){
        listed.add("Happy");
        listed.add("Justine");
        listed.add("Jay");

        assertEquals("Justine", listed.get(1));
    }

    @Test
    public void addThreeElements_replaceThirdElement(){
        listed.add("Happy");
        listed.add("Justine");
        listed.add("Jay");

        assertEquals("Justine", listed.set(1, "Justine"));
    }
}
