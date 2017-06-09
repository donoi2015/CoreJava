package mpp.extension;

public class MainTest {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		//B b = new A();
		B b1 = new B();
		a.two();
		//a.three() doesn't work
	}
}