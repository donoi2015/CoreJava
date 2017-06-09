package mpp.extension;

public class B extends A {
	public void two(){
		System.out.println(66);
	}
	
	public void three(){
		System.out.println("THREE IN B");
	}

	@Override
	public String toString() {
		return "THIS IS B";
	}
	
}
