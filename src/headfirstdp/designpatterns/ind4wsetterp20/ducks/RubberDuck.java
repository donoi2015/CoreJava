package headfirstdp.designpatterns.ind4wsetterp20.ducks;

import headfirstdp.designpatterns.ind4wsetterp20.behaviours.fly.FlyNoWay;
import headfirstdp.designpatterns.ind4wsetterp20.behaviours.quack.Squeak;

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
