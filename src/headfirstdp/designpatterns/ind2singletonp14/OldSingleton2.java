package headfirstdp.designpatterns.ind2singletonp14;

//This creates object before it's needed.

public class OldSingleton2 implements MyInterface{

    private static final OldSingleton2 instance = new OldSingleton2();
    //Remember final
    private OldSingleton2(){
    }
    
    public static OldSingleton2 getInstance(){
	return instance;
    }

    @Override
    public void doThis() {
	System.out.println("Do this! from OldSingleton2");
    }
}
