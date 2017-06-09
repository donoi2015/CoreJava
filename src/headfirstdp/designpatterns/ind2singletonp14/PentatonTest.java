package headfirstdp.designpatterns.ind2singletonp14;

import java.util.Arrays;

public class PentatonTest {

    public static void main(String[] args) {
	System.out.println(Pentaton.QUEEN.compareWith(Pentaton.ROOK));
	System.out.println(Arrays.asList(Pentaton.values()));
	System.out.println(Pentaton.QUEEN);
	System.out.println(Pentaton.QUEEN.power);
    }

}
