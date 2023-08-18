/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.AWTException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class MessageCommandTest {
    
    public MessageCommandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showMessage method, of class MessageCommand.
     */
    @Test
    public void testShowMessage() throws AWTException {
        System.out.println("showMessage");
        BoardDisplay UI = new BoardDisplay(8, 15);
        int level = 0;
        MessageCommandImpl instance = new MessageCommandImpl();
        instance.showMessage(UI, level);
    }

    public class MessageCommandImpl implements MessageCommand {

        public void showMessage(BoardDisplay UI, int level) {
        }
    }
    
}
