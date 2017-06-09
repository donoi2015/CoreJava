package headfirstdp.designpatterns.ind9Combined1p501.ducks;

import headfirstdp.designpatterns.ind9Combined1p501.Quackable;
import headfirstdp.designpatterns.ind9Combined1p501.observe.Observable;
import headfirstdp.designpatterns.ind9Combined1p501.observe.Observer;

public class GooseADuck implements Quackable {
    private Observable observable;
    private Goose goose;
    
    public GooseADuck (Goose goose){
	this.goose=goose;
	observable = new Observable(this);
    }
    
    @Override
    public void Quack() {
	goose.honk();
	notifyObservers();
    }

    @Override
    public void registerObserver(Observer aObserver) {
	observable.registerObserver(aObserver);
    }

    @Override
    public void notifyObservers() {
	observable.notifyObservers();
    }
    @Override
    public String toString() {
	return "Adapted Goose";
    }
    
}
