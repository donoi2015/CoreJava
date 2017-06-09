package headfirstdp.designpatterns.ind4wsetterp20.behaviours.fly;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
	System.out.println("Can't fly");
    }

}
