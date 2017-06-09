package mpp.carrier;

public abstract class Carrier implements ICarrier {
	private String description;
	private double weight;
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Carrier(String description, double weight) {
		this.setDescription(description);
		this.setWeight(weight);
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract double calculatePrice();
}
