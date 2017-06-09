package headfirstdp.designpatterns.ind2singletonp14;

public enum Pentaton {
	PAWN(1), KNIGHT(3), BISHOP(5), ROOK(5), QUEEN(9);

	public final int power;

	Pentaton(int a) {
		power = a;
	}

	public int compareWith(Pentaton other) {
		return power - other.power;
	}
}
