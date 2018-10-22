package ocjp.ch1.cat.species;

import ocjp.ch1.cat.BigCat;

/**
 * @author ts-tuluv.battulga
 */
public class Lynx extends BigCat {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        //        System.out.println(cat.hasFur);
        Lynx lynx = new Lynx();
        System.out.println(lynx.hasFur);
        //        System.out.println(cat.hasPaws);
        //        System.out.println(cat.id);
    }
}
