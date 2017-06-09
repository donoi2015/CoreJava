package headfirstdp.headfirst.factory.pizzaaf.pizzas;

import headfirstdp.headfirst.factory.pizzaaf.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
	System.out.println("Preparing " + name);
	dough = ingredientFactory.createDough();
	sauce = ingredientFactory.createSauce();
	cheese = ingredientFactory.createCheese();
    }
}
