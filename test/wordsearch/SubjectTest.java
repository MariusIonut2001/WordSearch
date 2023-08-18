package wordsearch;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SubjectTest {
    Subject subject;
    TestObserver observer1;
    TestObserver observer2;
    TestObserver observer3;

    @Before
    public void setUp() {
        subject = new Subject();
        observer1 = new TestObserver();
        observer2 = new TestObserver();
        observer3 = new TestObserver();
    }

    @Test
    public void testRegisterObserver() {
        subject.registerObserver(observer1);
        assertTrue(subject.observers.contains(observer1));
    }

    @Test
    public void testRemoveObserver() {
        subject.registerObserver(observer1);
        subject.removeObserver(observer1);
        assertFalse(subject.observers.contains(observer1));
    }

    @Test
    public void testNotifyObservers() {
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);
        subject.notifyObservers();
        assertTrue(observer1.isUpdated());
        assertTrue(observer2.isUpdated());
        assertTrue(observer3.isUpdated());
    }

    class TestObserver implements Observer {
        private boolean updated = false;
        @Override
        public void update() {
            updated = true;
        }

        public boolean isUpdated() {
            return updated;
        }
    }
}