package headfirstdp.designpatterns.ind9Combined1p501;

import headfirstdp.designpatterns.ind9Combined1p501.factory.AbstractFactory;
import headfirstdp.designpatterns.ind9Combined1p501.factory.CountingFactory;
import headfirstdp.designpatterns.ind9Combined1p501.observe.Quackologist;

public class CombinedTestDrive {

    public static void main(String[] args) {
	CombinedTestDrive ct = new CombinedTestDrive();
	CountingFactory cf = new CountingFactory();
	ct.simulate(cf);
    }

    private void simulate(AbstractFactory cf){
	Quackable duck1 = cf.createDecoyDuck();
	Quackable duck2 = cf.createDuckCall();
	Quackable duck3 = cf.createAdaptedDuck(); // adapter needs to instantiate Goose() first. 
	Quackable duck4 = cf.createRedHeadDuck();
	Quackable duck5 = cf.createRubberDuck();
	
	Flock f = new Flock();
	Quackologist q = new Quackologist();
	f.add(duck1);
	f.add(duck2);
	f.add(duck3);
	f.add(duck4);
	f.add(duck5);
	f.registerObserver(q);
	System.out.println("Flock quacks: ");
	f.Quack();
	System.out.println("\nDucks quack:");
	duck1.Quack();
	duck2.Quack();
	duck3.Quack();
	duck4.Quack();
	duck5.Quack();
	System.out.println("Number of quacks:" + QuackCounter.getQuackCount());
    }
}