package headfirstdp.designpatterns.ind0practice.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer aO) {
		observers.add(aO);
	}

	@Override
	public void unregister(Observer aO) {
		observers.remove(aO);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	public void setAAPLPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}

	public void setGOOGPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}
}