package headfirstdp.designpatterns.ind9Combined1p501.observe;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private Subject duck;
    
    public Observable(Subject duck){
	this.duck = duck;
    }
    @Override
    public void registerObserver(Observer aObserver) {
	observers.add(aObserver);
    }
    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(duck);
        }
    }


}
