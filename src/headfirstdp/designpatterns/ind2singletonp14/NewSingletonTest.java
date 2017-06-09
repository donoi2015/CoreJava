package headfirstdp.designpatterns.ind2singletonp14;

public class NewSingletonTest {

    public static void main(String[] args) {

	NewSingleton.INSTANCE.sayHello();
	NewSingleton.INSTANCE.sayBye();
	
	NewSingleton mySingleton = NewSingleton.INSTANCE;
	mySingleton.sayBye();
	mySingleton.sayHello();
	mySingleton.doThis();
    }
}
