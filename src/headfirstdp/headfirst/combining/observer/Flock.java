package headfirstdp.headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Flock implements Quackable {
    private ArrayList ducks = new ArrayList();

    public void add(Quackable duck) {
	ducks.add(duck);
    }

    @Override
    public void quack() {
        for (Object duck1 : ducks) {
            Quackable duck = (Quackable) duck1;
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Object duck1 : ducks) {
            Quackable duck = (Quackable) duck1;
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
	return "Flock of Ducks";
    }
}
