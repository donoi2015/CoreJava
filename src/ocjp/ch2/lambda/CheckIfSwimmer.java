package ocjp.ch2.lambda;

/**
 * @author ts-tuluv.battulga
 */
public class CheckIfSwimmer implements CheckTrait {
    @Override public boolean test(Animal a) {
        return a.canSwim();
    }
}
