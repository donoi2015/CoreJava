package headfirstdp.designpatterns.ind9Combined1p501.factory;

import headfirstdp.designpatterns.ind9Combined1p501.Quackable;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.DecoyDuck;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.DuckCall;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.Goose;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.GooseADuck;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.RedHeadDuck;
import headfirstdp.designpatterns.ind9Combined1p501.ducks.RubberDuck;

public class ConcreteFactory extends AbstractFactory {

    @Override
    public Quackable createDecoyDuck() {
	return new DecoyDuck();
    }

    @Override
    public Quackable createDuckCall() {
	return new DuckCall();
    }

    @Override
    public Quackable createRedHeadDuck() {
	return new RedHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
	return new RubberDuck();
    }

    @Override
    public Quackable createAdaptedDuck() {
	return new GooseADuck(new Goose());
    }

}
