package headfirstdp.headfirst.factory.pizzaaf;

import headfirstdp.headfirst.factory.pizzaaf.ingredients.Cheese;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Clams;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Dough;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Pepperoni;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Sauce;
import headfirstdp.headfirst.factory.pizzaaf.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
