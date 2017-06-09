package headfirstdp.designpatterns.ind3strategyp15;

public class MallardDuck extends Duck {
    public MallardDuck(){
	quackBehaviour = new Quack();
	flyBehaviour = new FlyWithWings();
    }
    public void display(){
	System.out.println("I'm a real Mallard Duck!");
    }
}
