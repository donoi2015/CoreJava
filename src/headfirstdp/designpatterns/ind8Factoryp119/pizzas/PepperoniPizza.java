package headfirstdp.designpatterns.ind8Factoryp119.pizzas;

import headfirstdp.designpatterns.ind8Factoryp119.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
	name = "Pepperoni Pizza";
	dough = "Crust";
	sauce = "Marinara sauce";
	toppings.add("Sliced Pepperoni");
	toppings.add("Sliced Onion");
	toppings.add("Grated parmesan cheese");
    }
}
