package headfirstdp.headfirst.factory.pizzafm.stores;

import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleCheesePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleClamPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStylePepperoniPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleVeggiePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new ChicagoStyleCheesePizza();
			case "veggie":
				return new ChicagoStyleVeggiePizza();
			case "clam":
				return new ChicagoStyleClamPizza();
			case "pepperoni":
				return new ChicagoStylePepperoniPizza();
			default:
				return null;
		}
	}
}
