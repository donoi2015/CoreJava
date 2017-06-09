package headfirstdp.headfirst.factory.pizzaaf;

import headfirstdp.headfirst.factory.pizzaaf.ingredients.BlackOlives;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Cheese;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Clams;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Dough;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Eggplant;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.FrozenClams;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.MozzarellaCheese;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Pepperoni;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.PlumTomatoSauce;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Sauce;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.SlicedPepperoni;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Spinach;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.ThickCrustDough;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
	return new ThickCrustDough();
    }

    public Sauce createSauce() {
	return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
	return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(), new Spinach(), new Eggplant() };
    }

    public Pepperoni createPepperoni() {
	return new SlicedPepperoni();
    }

    public Clams createClam() {
	return new FrozenClams();
    }
}
