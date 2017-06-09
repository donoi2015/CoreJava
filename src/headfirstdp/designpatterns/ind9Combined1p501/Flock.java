package headfirstdp.designpatterns.ind9Combined1p501;

import headfirstdp.designpatterns.ind9Combined1p501.observe.Observable;
import headfirstdp.designpatterns.ind9Combined1p501.observe.Observer;

import java.util.ArrayList;

public class Flock implements Quackable { //not sure why this implements Quackable
    private Observable observable;
    private ArrayList<Quackable> flock = new ArrayList<>();
    public Flock(){
	observable = new Observable(this);
    }
    void add(Quackable q){
	flock.add(q);
    }
    public void Quack(){
        for (Quackable duck : flock) {
            duck.Quack();
        }
    }
    @Override
    public void registerObserver(Observer aObserver) {
        for (Quackable duck : flock) {
            duck.registerObserver(aObserver);
        }
    }
    @Override
    public void notifyObservers() {
    }
}