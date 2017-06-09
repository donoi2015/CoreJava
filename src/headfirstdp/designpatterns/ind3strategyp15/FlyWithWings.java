package headfirstdp.designpatterns.ind3strategyp15;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
	System.out.println("Flying with wings");
    }

}
