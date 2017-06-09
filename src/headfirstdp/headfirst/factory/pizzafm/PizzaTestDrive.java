package headfirstdp.headfirst.factory.pizzafm;

import headfirstdp.headfirst.factory.pizzafm.pizzas.Pizza;
import headfirstdp.headfirst.factory.pizzafm.stores.ChicagoPizzaStore;
import headfirstdp.headfirst.factory.pizzafm.stores.NYPizzaStore;
import headfirstdp.headfirst.factory.pizzafm.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
	PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();

	Pizza pizza = nyStore.orderPizza("cheese");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = chicagoStore.orderPizza("cheese");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("clam");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = chicagoStore.orderPizza("clam");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("pepperoni");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = chicagoStore.orderPizza("pepperoni");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("veggie");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");

	pizza = chicagoStore.orderPizza("veggie");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
