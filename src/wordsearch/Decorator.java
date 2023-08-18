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
interface WordDecorator {
    void decorate();
}

class Decorator implements WordDecorator {
    private GameScore gameScore;

    public Decorator() {

    }

    public void setScore(GameScore gs) {
        gameScore = gs;
    }

    @Override
    public void decorate() {
        System.out.println("Scorul prezent este: " + gameScore.getScore());
    }
}
