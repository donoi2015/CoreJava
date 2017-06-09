package headfirstdp.designpatterns.ind3strategyp15;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
	System.out.println("Squeak!");
    }

}
