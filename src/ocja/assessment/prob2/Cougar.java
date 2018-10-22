package ocja.assessment.prob2;

/**
 * @author ts-tuluv.battulga
 */
public class Cougar extends Puma {
    public static void main(String[] args) {
        //        Puma puma = new Puma() {
        //            @Override public int getTailLength() {
        //                return 2;
        //            }
        //        };
        //        Puma puma = new Puma();                            //will not compile because of this line, abstract class cannot be instantiated
        //        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 4;
    }
}
