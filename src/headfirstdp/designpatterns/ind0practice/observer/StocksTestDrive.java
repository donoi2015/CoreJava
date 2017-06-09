package headfirstdp.designpatterns.ind0practice.observer;

public class StocksTestDrive {

    public static void main(String[] args) {
	StockGrabber sg = new StockGrabber();
	StockObserver so = new StockObserver(sg);
	
	sg.setIBMPrice(197.00);
	sg.setAAPLPrice(677.60);
	sg.setGOOGPrice(676.40);
	StockObserver so2 = new StockObserver(sg);
	sg.setIBMPrice(196.00);
	sg.setAAPLPrice(674.60);
	sg.setGOOGPrice(674.77);
    }
}