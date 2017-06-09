package headfirstdp.designpatterns.ind7Decoratorp79.condiments;

import headfirstdp.designpatterns.ind7Decoratorp79.Beverage;
import headfirstdp.designpatterns.ind7Decoratorp79.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
	this.beverage = beverage;
    }

    public String getDescription() {
	return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
	return .20 + beverage.cost();
    }
}
