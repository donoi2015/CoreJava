package headfirstdp.designpatterns.ind7Decoratorp79;

public abstract class Beverage {

	protected String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
