package headfirstdp.designpatterns.ind8Factoryp119;

import headfirstdp.designpatterns.ind8Factoryp119.pizzas.CheesePizza;
import headfirstdp.designpatterns.ind8Factoryp119.pizzas.ClamPizza;
import headfirstdp.designpatterns.ind8Factoryp119.pizzas.PepperoniPizza;
import headfirstdp.designpatterns.ind8Factoryp119.pizzas.VeggiePizza;

class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
			case "cheese":
				pizza = new CheesePizza();
				break;
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
			case "clam":
				pizza = new ClamPizza();
				break;
			case "veggie":
				pizza = new VeggiePizza();
				break;
		}
		return pizza;
	}
}
