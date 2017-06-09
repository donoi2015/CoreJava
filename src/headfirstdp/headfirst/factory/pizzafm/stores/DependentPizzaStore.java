package headfirstdp.headfirst.factory.pizzafm.stores;

import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleCheesePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleClamPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStylePepperoniPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.ChicagoStyleVeggiePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleCheesePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleClamPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStylePepperoniPizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.NYStyleVeggiePizza;
import headfirstdp.headfirst.factory.pizzafm.pizzas.Pizza;

class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		switch (style) {
			case "NY":
				if (type.equals("cheese")) {
					pizza = new NYStyleCheesePizza();
				} else if (type.equals("veggie")) {
					pizza = new NYStyleVeggiePizza();
				} else if (type.equals("clam")) {
					pizza = new NYStyleClamPizza();
				} else if (type.equals("pepperoni")) {
					pizza = new NYStylePepperoniPizza();
				}
				break;
			case "Chicago":
				if (type.equals("cheese")) {
					pizza = new ChicagoStyleCheesePizza();
				} else if (type.equals("veggie")) {
					pizza = new ChicagoStyleVeggiePizza();
				} else if (type.equals("clam")) {
					pizza = new ChicagoStyleClamPizza();
				} else if (type.equals("pepperoni")) {
					pizza = new ChicagoStylePepperoniPizza();
				}
				break;
			default:
				System.out.println("Error: invalid type of pizza");
				return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
