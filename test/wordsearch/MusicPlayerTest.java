/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marius
 */
public class MusicPlayerTest {
    MusicPlayer player;
    String musicPath = "src\\wordsearch\\melodie.wav";
    public MusicPlayerTest() {
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

    public void testPlay() {
        player = new MusicPlayer(musicPath);
        player.play();
        assertTrue(player.clip.isActive());
    }

    @Test
    public void testStop() {
        player = new MusicPlayer(musicPath);
        player.play();
        player.stop();
        assertFalse(player.clip.isActive());
    }
}
//Acest exemplu de teste verifica daca metoda play() incepe sa redea muzica, daca metoda stop() opreste redarea muzicii si daca metoda repeat() repeta redarea muzicii. 
//Este important sa aveti un fisier audio la path-ul specificat in variabila musicPath pentru a putea ruleaza aceste teste cu succes.