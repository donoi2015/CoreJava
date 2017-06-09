package headfirstdp.designpatterns.ind4wsetterp20.ducks;

import headfirstdp.designpatterns.ind4wsetterp20.behaviours.fly.FlyNoWay;
import headfirstdp.designpatterns.ind4wsetterp20.behaviours.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
	flyBehaviour = new FlyNoWay();
	quackBehaviour = new Quack();
    }

    @Override
    public void display() {
	System.out.println("I'm a model duck");
    }

}
