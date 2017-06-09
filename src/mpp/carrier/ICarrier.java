package mpp.carrier;

interface ICarrier {
	String getDescription();
	void setDescription(String description);
	double getWeight();
	void setWeight(double weight);
	double calculatePrice();
	double getPrice();
	void setPrice(double price);
}
