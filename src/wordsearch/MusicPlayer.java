/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Marius
 */
 public class MusicPlayer {
            Clip clip;
            private String musicPath;

            public MusicPlayer(String musicPath) {
                this.musicPath = musicPath;
            }

            public void play() {
                try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(musicPath));
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            public void stop() {
                clip.stop();
                clip.close();
            }
            public void repeat() {
                clip.loop(10);
            }
        }
