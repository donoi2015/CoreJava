package headfirstdp.designpatterns.ind3strategyp15;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
	System.out.println("<< S i l e n c e >>");
    }

}
