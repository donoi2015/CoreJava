package headfirstdp.designpatterns.ind3strategyp15;


abstract class Duck {
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
}
