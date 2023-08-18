/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.AWTException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marius
 */
public class SuccessMessageTest {
    
    public SuccessMessageTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
      public void testShowMessage() throws AWTException {
        System.out.println("showMessage");
        BoardDisplay UI = new BoardDisplay(8,15);
        int level = 0;
        SuccessMessage instance = new SuccessMessage();
        instance.showMessage(UI, level);
    }
    
}
