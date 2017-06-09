package headfirstdp.designpatterns.ind7Decoratorp79;

import headfirstdp.designpatterns.ind7Decoratorp79.coffee.DarkRoast;
import headfirstdp.designpatterns.ind7Decoratorp79.coffee.Espresso;
import headfirstdp.designpatterns.ind7Decoratorp79.condiments.Mocha;
import headfirstdp.designpatterns.ind7Decoratorp79.condiments.Soy;
import headfirstdp.designpatterns.ind7Decoratorp79.condiments.Whip;

public class CoffeeHouse {

	public static void main(String[] args) {

		Beverage bev = new DarkRoast();
		bev = new Mocha(bev);
		bev = new Mocha(bev);
		bev = new Soy(bev);
		bev = new Whip(bev);
		Beverage bev2 = new Whip(new Whip(new Soy(new Soy(new Mocha(
				new Espresso())))));
		System.out.println(bev.getDescription() + " $" + bev.cost());
		System.out.println(bev2.getDescription() + " $" + bev2.cost());
	}
}