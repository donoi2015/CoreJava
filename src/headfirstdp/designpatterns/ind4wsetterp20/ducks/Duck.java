package headfirstdp.designpatterns.ind4wsetterp20.ducks;

import headfirstdp.designpatterns.ind4wsetterp20.behaviours.fly.FlyBehaviour;
import headfirstdp.designpatterns.ind4wsetterp20.behaviours.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public abstract void display();
    
    public void performQuack(){
	quackBehaviour.quack();
    }
    public void swim(){
	System.out.println("Swimming");
    }
    public void performFly(){
	flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour aFlyBehaviour) {
        flyBehaviour = aFlyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour aQuackBehaviour) {
        quackBehaviour = aQuackBehaviour;
    }
}
