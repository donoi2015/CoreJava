package ocja.assessment.prob2;

/**
 * @author ts-tuluv.battulga
 */
abstract class Puma implements HasTail {
    //    protected int getTailLength() {              //will not compile because of this line, cannot override with more restrictive access modifier
    //        return 4;
    //    }
    public int getTailLength() {
        return 2;
    }
}
