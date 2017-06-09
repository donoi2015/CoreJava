package headfirstdp.designpatterns.ind3strategyp15;

public class RubberDuck extends Duck {
    
    public RubberDuck(){
	quackBehaviour = new Squeak();
	flyBehaviour = new FlyNoWay();
    }
    
    @Override
    public void display() {
	System.out.println("I'm a rubber duck.");
    }

}
