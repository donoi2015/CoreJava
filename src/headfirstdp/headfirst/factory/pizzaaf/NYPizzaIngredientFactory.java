package headfirstdp.headfirst.factory.pizzaaf;

import headfirstdp.headfirst.factory.pizzaaf.ingredients.Cheese;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Clams;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Dough;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.FreshClams;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Garlic;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.MarinaraSauce;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Mushroom;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Onion;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Pepperoni;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.RedPepper;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.ReggianoCheese;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Sauce;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.SlicedPepperoni;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.ThinCrustDough;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
	return new ThinCrustDough();
    }

    public Sauce createSauce() {
	return new MarinaraSauce();
    }

    public Cheese createCheese() {
	return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(),
            new RedPepper() };
    }

    public Pepperoni createPepperoni() {
	return new SlicedPepperoni();
    }

    public Clams createClam() {
	return new FreshClams();
    }
}
