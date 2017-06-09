package headfirstdp.designpatterns.ind2singletonp14;

public class OldSingletonTest {

    public static void main(String[] args) {
	OldSingleton old = OldSingleton.getInstance();
	OldSingleton2 old2 = OldSingleton2.getInstance();
	OldSingleton3 old3 = OldSingleton3.getInstance();
	old.doThis();
	old2.doThis();
	old3.doThis();
    }

}
