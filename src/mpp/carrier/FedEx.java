package mpp.carrier;

public class FedEx extends Carrier {
	public FedEx(String description, double weight, String zone) {
		super(description, weight);
		this.setZone(zone);
	}

	private String zone = "";
		
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		double rate = 0;
		switch(this.getZone()) {
		case "IA" : rate = 0.35; break;
		case "MT" : rate = 0.35; break;
		case "OR" : rate = 0.35; break;
		case "CA" : rate = 0.35; break;
		case "TX" : rate = 0.3; break;
		case "UT" : rate = 0.3; break;
		case "FL" : rate = 0.55; break;
		case "MA " : rate = 0.55; break;
		case "OH" : rate = 0.55; break;
		default : rate = 0.43; break;
		}
		this.setPrice(rate * this.getWeight());
		return this.getPrice();
	}

	private String getZone() {
		return zone;
	}

	private void setZone(String zone) {
		this.zone = zone;
	}

}
