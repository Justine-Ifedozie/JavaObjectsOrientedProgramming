import main.Queues.Queues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queues Que;

    @BeforeEach
    public void doThisBeforeTesting(){
        Que = new Queues();
    }

    @Test
    public void testThatNewQueueIsEmpty(){
        assertTrue(Que.isEmpty());
    }

    @Test
    public void testThatNewQueueIsNotEmpty(){
        Que.add(26);
        assertFalse(Que.isEmpty());
    }

    @Test
    public void addOneElementRemoveOneElement_queueIsEmpty(){
        Que.add(26);
        Que.remove();
        assertTrue(Que.isEmpty());
    }

    @Test
    public void addFourElementsRemoveOneElement_theFirstElementIsRemoved(){
        Que.add(26);
        Que.add(19);
        Que.add(13);
        Que.add(29);

        assertEquals(26, Que.remove());
    }

    @Test
    public void addOneElementWithOfferRemoveOneElement_queueIsEmpty() {
        Que.offer(26);
        Que.remove();
        assertTrue(Que.isEmpty());
    }

    @Test
    public void addOneElement_confirmElementWasAdded(){
        assertTrue(Que.offer(23));
    }
}
