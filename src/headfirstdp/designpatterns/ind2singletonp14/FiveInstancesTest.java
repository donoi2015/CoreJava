package headfirstdp.designpatterns.ind2singletonp14;

public class FiveInstancesTest {

    public static void main(String[] args) {
	try {
	    FiveInstances instance1 = FiveInstances.CreateInstance();
	    FiveInstances instance2 = FiveInstances.CreateInstance();
	    FiveInstances instance3 = FiveInstances.CreateInstance();
	    FiveInstances instance4 = FiveInstances.CreateInstance();
	    FiveInstances instance5 = FiveInstances.CreateInstance();
	    FiveInstances instance6 = FiveInstances.CreateInstance();
	    FiveInstances instance7 = FiveInstances.CreateInstance();
	    FiveInstances instance8 = FiveInstances.CreateInstance();
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }

}
