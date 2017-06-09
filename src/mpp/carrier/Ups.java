package mpp.carrier;

public class Ups extends Carrier {
	public Ups(String description, double weight) {
		super(description, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		this.setPrice(0.45 * this.getWeight());
		return this.getPrice();
	}

}
