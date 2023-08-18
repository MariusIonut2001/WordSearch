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


public class GameScore {
    private static GameScore instance;
    static int score;
    private GameScore(int score) {
this.score=score;
    }

    public GameScore() {
    }
    

    public static GameScore getInstance(int score) {
        if (instance == null) {
            instance = new GameScore(score);
        }
        return instance;
    }

    public static void incrementScore() {
        score++;
    }

    public static int getScore() {
        return score;
    }
    public static void resetScore(){
    instance.score=0;
    }
}
