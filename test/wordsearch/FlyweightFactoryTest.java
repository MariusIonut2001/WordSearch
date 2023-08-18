/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 *
 * @author Marius
 */import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class FlyweightFactoryTest {
    FlyweightFactory factory;

    @Before
    public void setUp() {
        factory = new FlyweightFactory();
    }

    @Test
    public void testGetFlyweight() {
        Flyweight flyweight0 = factory.getFlyweight(0);
        Flyweight flyweight1 = factory.getFlyweight(1);
        assertNotNull(flyweight0);
        assertNotNull(flyweight1);
    }

    @Test
    public void testFlyweightOperation() {
        Flyweight flyweight0 = factory.getFlyweight(0);
        Flyweight flyweight1 = factory.getFlyweight(1);
        flyweight0.operation(5);
        flyweight1.operation(10);
    }

}