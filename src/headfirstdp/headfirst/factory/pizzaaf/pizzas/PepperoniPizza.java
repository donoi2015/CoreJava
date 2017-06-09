package headfirstdp.headfirst.factory.pizzaaf.pizzas;

import headfirstdp.headfirst.factory.pizzaaf.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
	this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
	System.out.println("Preparing " + name);
	dough = ingredientFactory.createDough();
	sauce = ingredientFactory.createSauce();
	cheese = ingredientFactory.createCheese();
	veggies = ingredientFactory.createVeggies();
	pepperoni = ingredientFactory.createPepperoni();
    }
}
