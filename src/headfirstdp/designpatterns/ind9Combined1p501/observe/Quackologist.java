package headfirstdp.designpatterns.ind9Combined1p501.observe;

public class Quackologist implements Observer {

    @Override
    public void update(Subject aDuck) {
	System.out.println("Quackologist: " + aDuck + " just quacked.");
    }
}
