package headfirstdp.designpatterns.ind2singletonp14;

public enum Quadrupleton implements Operator {
	PLUS {
		public int operate(int a, int b) {
			return a + b;
		}
	},
	MINUS {
		public int operate(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {
		public int operate(int a, int b) {
			return a * b;
		}
	},
	DIVIDE {
		public int operate(int a, int b) {
			return a / b;
		}
	};

	public void doThis() {
		System.out.println("Do this!");
	}
}
