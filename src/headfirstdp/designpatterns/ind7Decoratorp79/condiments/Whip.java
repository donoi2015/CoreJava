package headfirstdp.designpatterns.ind7Decoratorp79.condiments;

import headfirstdp.designpatterns.ind7Decoratorp79.Beverage;
import headfirstdp.designpatterns.ind7Decoratorp79.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
	this.beverage = beverage;
    }

    public String getDescription() {
	return beverage.getDescription() + ", Whip";
    }

    public double cost() {
	return .10 + beverage.cost();
    }
}
