package headfirstdp.designpatterns.ind9Adapterp235;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
	System.out.println("Duck quacking");
    }
    

    @Override
    public void fly() {
	System.out.println("Duck flying");
    }

}
