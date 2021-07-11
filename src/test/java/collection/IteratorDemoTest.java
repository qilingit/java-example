package collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IteratorDemoTest {
    IteratorDemo iteratorDemo = new IteratorDemo();

    @Test
    void testHasNext_NoNext() {
        assertFalse(iteratorDemo.testHasNext(iteratorDemo.list));
    }

    @Test
    void testHastNext_NoNext() {
        iteratorDemo.list.add("A");
        iteratorDemo.list.add("B");
        assertTrue(iteratorDemo.testHasNext(iteratorDemo.list));
    }
}