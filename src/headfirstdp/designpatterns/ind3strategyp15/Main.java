package headfirstdp.designpatterns.ind3strategyp15;

public class Main {
	public static void main(String[] args) {
		Duck m = new MallardDuck();
		m.quackBehaviour = new Squeak();
		m.display();
		m.performFly();
		m.performQuack();
		System.out.println("--------------");
		m = new RubberDuck();
		m.display();
		m.performFly();
		m.performQuack();
	}
}