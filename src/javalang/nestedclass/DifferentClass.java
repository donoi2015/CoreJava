package javalang.nestedclass;

public class DifferentClass {

	public static void main(String[] args) {
		AccessExample ae = new AccessExample();
		ae.new A().print();
		AccessExample.B b = new AccessExample.B();
		b.print();
	}
}