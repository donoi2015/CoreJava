package headfirstdp.headfirst.factory.pizzaaf;

import headfirstdp.headfirst.factory.pizzaaf.pizzas.CheesePizza;
import headfirstdp.headfirst.factory.pizzaaf.pizzas.ClamPizza;
import headfirstdp.headfirst.factory.pizzaaf.pizzas.PepperoniPizza;
import headfirstdp.headfirst.factory.pizzaaf.pizzas.Pizza;
import headfirstdp.headfirst.factory.pizzaaf.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
	Pizza pizza = null;
	PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

	switch (item) {
	case "cheese":
	    pizza = new CheesePizza(ingredientFactory);
	    pizza.setName("New York Style Cheese Pizza");
	    break;
	case "veggie":
	    pizza = new VeggiePizza(ingredientFactory);
	    pizza.setName("New York Style Veggie Pizza");
	    break;
	case "clam":
	    pizza = new ClamPizza(ingredientFactory);
	    pizza.setName("New York Style Clam Pizza");
	    break;
	case "pepperoni":
	    pizza = new PepperoniPizza(ingredientFactory);
	    pizza.setName("New York Style Pepperoni Pizza");
	    break;
	default:
	    break;
	}
	return pizza;
    }
}
