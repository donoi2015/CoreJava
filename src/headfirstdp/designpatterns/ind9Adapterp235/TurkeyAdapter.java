package headfirstdp.designpatterns.ind9Adapterp235;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey aTurkey) {
	turkey = aTurkey;
    }

    @Override
    public void quack() {
	turkey.gobble();
    }

    @Override
    public void fly() {
	for (int i = 0; i < 5; i++) {
	    turkey.fly();
	}
    }
}
