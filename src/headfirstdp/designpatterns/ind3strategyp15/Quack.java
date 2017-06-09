package headfirstdp.designpatterns.ind3strategyp15;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
	System.out.println("Quack quack!");
    }

}
