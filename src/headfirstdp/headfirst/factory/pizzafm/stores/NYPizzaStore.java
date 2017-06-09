package headfirstdp.headfirst.factory.pizzafm.stores;

import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleCheesePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleClamPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStylePepperoniPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleVeggiePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
	}
}
