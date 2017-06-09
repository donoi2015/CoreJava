package headfirstdp.headfirst.singleton.subclass;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
