package headfirstdp.designpatterns.ind7Decoratorp79.coffee;

import headfirstdp.designpatterns.ind7Decoratorp79.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
	description = "Espresso";
    }

    public double cost() {
	return 1.99;
    }
}
