package ocja.assessment.prob15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ts-tuluv.battulga
 */
interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            Amphibian tadpole = amphibian;
            CanSwim tadpole1 = amphibian;
            Object tadpole2 = amphibian;
        }
    }
}