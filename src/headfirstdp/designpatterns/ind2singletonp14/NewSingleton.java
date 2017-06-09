package headfirstdp.designpatterns.ind2singletonp14;

public enum NewSingleton implements MyInterface{
    INSTANCE;

    
    public void sayHello() {
	System.out.println("Hello World");
    }

    public void sayBye() {
	System.out.println("Bye Bye");
    }

    @Override
    public void doThis() {
	System.out.println("Do this!");
    }
}
