package headfirstdp.designpatterns.ind2singletonp14;

//This way is not thread safe

public class OldSingleton implements MyInterface{
    private static OldSingleton instance = null; //remember static
    
    private OldSingleton(){
    }
    
    public static OldSingleton getInstance(){ //remember static
    //sometimes we make this synchronized but application performance degrades
	if(instance==null){
	    instance = new OldSingleton();
	}
	return instance;
    }

    @Override
    public void doThis() {
	System.out.println("Do this!");
    }
}
