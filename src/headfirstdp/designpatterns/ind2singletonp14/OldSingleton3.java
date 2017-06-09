package headfirstdp.designpatterns.ind2singletonp14;

public class OldSingleton3 implements MyInterface{

    private static OldSingleton3 instance = null;

    private OldSingleton3() {
    }

    public static OldSingleton3 getInstance() {
	if (instance == null) {
	    synchronized (OldSingleton3.class) {
		if (instance == null)
		    instance = new OldSingleton3();
	    }
	}
	return instance;
    }

    @Override
    public void doThis() {
	System.out.println("Do this! from old3");
    }
}
