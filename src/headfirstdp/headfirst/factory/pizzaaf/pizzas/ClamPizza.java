package headfirstdp.headfirst.factory.pizzaaf.pizzas;

import headfirstdp.headfirst.factory.pizzaaf.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
	System.out.println("Preparing " + name);
	dough = ingredientFactory.createDough();
	sauce = ingredientFactory.createSauce();
	cheese = ingredientFactory.createCheese();
	clam = ingredientFactory.createClam();
    }
}
