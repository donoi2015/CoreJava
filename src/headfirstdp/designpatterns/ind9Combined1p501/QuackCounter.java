package headfirstdp.designpatterns.ind9Combined1p501;

import headfirstdp.designpatterns.ind9Combined1p501.observe.Observer;

public class QuackCounter implements Quackable{
    private Quackable duck;
    private static int count;
    
    public QuackCounter(Quackable quacker){
	this.duck = quacker;
    }
    @Override
    public void Quack() {
	count++;
	duck.Quack();
    }
    
    public static int getQuackCount(){
	return count;
    }
    @Override
    public void registerObserver(Observer aObserver) {
	duck.registerObserver(aObserver);
    }
    @Override
    public void notifyObservers() {
	duck.notifyObservers();
    }
}
