package mpp.carrier;

public class UsMail extends Carrier {

	public UsMail(String description, double weight) {
		super(description, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		if(this.getWeight() < 3)
			this.setPrice(1);
		else
			this.setPrice(0.55 * this.getWeight());
		return this.getPrice();
	}

}
