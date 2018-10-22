package ocjp.ch2.lambda;

/**
 * @author ts-tuluv.battulga
 */
public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}