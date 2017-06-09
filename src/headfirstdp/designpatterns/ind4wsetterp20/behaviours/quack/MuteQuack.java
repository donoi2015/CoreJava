package headfirstdp.designpatterns.ind4wsetterp20.behaviours.quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
	System.out.println("<< S i l e n c e >>");
    }

}
