package headfirstdp.designpatterns.ind0practice.observer;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	private static int observerIDTracker = 0;

	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;

		System.out.println("New observer " + observerID);
		stockGrabber.register(this);
	}

	@Override
	public void update(double aIbmPrice, double aAaplPrice, double aGoogPrice) {
		this.aaplPrice = aAaplPrice;
		this.ibmPrice = aIbmPrice;
		this.googPrice = aGoogPrice;

		printPrices();
	}

	private void printPrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice);
		System.out.println("Apple: " + aaplPrice);
		System.out.println("Google: " + googPrice + "\n");
	}

}
