/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

/**
 *
 * @author Marius
 */
interface MusicPlayerInterface {
        void play();
        void stop();
        void repeat();
        //void setVolume(double volume);
    }
    public class MusicPlayerAdapter implements MusicPlayerInterface {

        private MusicPlayer musicPlayer;

        public MusicPlayerAdapter(String musicPath) {
            musicPlayer = new MusicPlayer(musicPath);
        }

        @Override
        public void play() {
            musicPlayer.play();
        }

        @Override
        public void stop() {
            musicPlayer.stop();
        }

        @Override
        public void repeat() {
            musicPlayer.repeat();
        }}
