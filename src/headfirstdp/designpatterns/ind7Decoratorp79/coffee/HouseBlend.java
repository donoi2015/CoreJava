package headfirstdp.designpatterns.ind7Decoratorp79.coffee;

import headfirstdp.designpatterns.ind7Decoratorp79.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
	description = "House Blend Coffee";
    }

    public double cost() {
	return .89;
    }
}
