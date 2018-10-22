package ocjp.ch1;

/**
 * @author ts-tuluv.battulga
 */
public class FourLegged {
    String walk = "walk,";

    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }

    static class BabyRhino extends FourLegged {
        String walk = "toddle,";
    }
}