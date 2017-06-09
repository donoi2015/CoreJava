package headfirstdp.headfirst.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
    private ArrayList observers = new ArrayList();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
	this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
	observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.update(duck);
        }
    }

    public Iterator getObservers() {
	return observers.iterator();
    }
}
