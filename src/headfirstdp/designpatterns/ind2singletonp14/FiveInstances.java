package headfirstdp.designpatterns.ind2singletonp14;

public class FiveInstances {

    private static int i = 0;

    private FiveInstances() {
	System.out.println("Instance no."+i+" created.");
    }

    public static FiveInstances CreateInstance() throws Exception {
	if (i < 5) {
	    i++;
	    return new FiveInstances();
	} else
	    throw new Exception("Can not create more then 5 instance of this class");
    }
}
