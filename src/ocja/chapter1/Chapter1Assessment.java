package ocja.chapter1;

/**
 * @author ts-tuluv.battulga
 */
public class Chapter1Assessment {

    public static void main(String[] args) {
        problem1();
    }

    static void problem1() {
        //which are valid identifiers?
        //X        A$B
        //X        _helloWorld
        //        true             reserved keyword
        //        java.lang       . is not allowed
        //X        Public
        //        1980_s   first character must be a letter, $ or _
    }

    public void problem3() {
        //which line compiler error?
        short numPets = 5;
        //         int numGrains = 5.6;
        String name = "Scruffy";
        //         numPets.length();
        //         numGrains.length();
        name.length();
    }
}
