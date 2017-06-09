package headfirstdp.designpatterns.ind9Combined1p501.factory;

import headfirstdp.designpatterns.ind9Combined1p501.Quackable;

public abstract class AbstractFactory { //should be class not interface
    public abstract Quackable createDecoyDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck(); // abstract Quackable not void
    public abstract Quackable createAdaptedDuck();
}