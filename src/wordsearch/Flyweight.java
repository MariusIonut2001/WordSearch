/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marius
 */
interface Flyweight {
    void operation(int extrinsicState);
}

//Clasa concrete flyweight
class ConcreteFlyweight implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweight(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(int extrinsicState) {
        System.out.println("Intrinsic State = " + intrinsicState + ", Extrinsic State = " + extrinsicState);
    }
}

//Flyweight factory
class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put(0, new ConcreteFlyweight(0));
        flyweights.put(1, new ConcreteFlyweight(1));
    }

    public Flyweight getFlyweight(int key) {
        return flyweights.get(key);
    }
}
