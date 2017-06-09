package mpp.carrier;

class Person {

	private String name;
	private int	age;
	
	Person() {
		
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDiscountPercent() {
		if(this.age >= 65)
			return 15;
		return 0;
	}
	

}

