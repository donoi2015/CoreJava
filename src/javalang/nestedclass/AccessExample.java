package javalang.nestedclass;

public class AccessExample {
	
	private static final int var1=5;
	private int var2 = 1;
	private int var3 = 2;
	
	public static void main(String[] args) {
		AccessExample ae = new AccessExample();
		A a = ae.new A();
		a.print();
		System.out.println(a.prvarA+",  "+a.pvarA);
		C c = ae.new C();
		c.print();
		System.out.println(c.prvarC+",  "+c.pvarC);
		staticMethod();
		B b = new B();
		b.print();
	}

	public class A {
		public int pvarA = 100;
		private int prvarA = 100;
		
		public void print(){
			System.out.println("Class A"+var2+var3);
		}
	}

	public static class B {
		public void print(){
			System.out.println("Static Class B!"+var1);
		}
	}

	private class C {
		public int pvarC = 100;
		private int prvarC = 100;
		
		public void print(){
			System.out.println("Class C"+var2+var3);
		}
	}
	
	private static class D{
		public int pvarD= 100;
		private int prvarD = 100;
		
		public void print(){
		//	System.out.println("Class D"+var2+var3);
		}
	}
	
	private static void staticMethod(){
		System.out.println("Static method of main!");
	}
}
