/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Marius
 */
interface Observer {
    void update();
}

class SoundObserver implements Observer {
    private Clip clip;
    public SoundObserver(){
     try {
            // load the sound file
            
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource("wee.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        }  catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     @Override
    public void update() {
        clip.start();
    }
    }
    
    

