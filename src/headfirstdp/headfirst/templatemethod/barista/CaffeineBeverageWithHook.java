package headfirstdp.headfirst.templatemethod.barista;

abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
	boilWater();
	brew();
	pourInCup();
	if (customerWantsCondiments()) {
	    addCondiments();
	}
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
	System.out.println("Boiling water");
    }

    private void pourInCup() {
	System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
	return true;
    }
}
