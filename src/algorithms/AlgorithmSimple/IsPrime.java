package algorithms.AlgorithmSimple;

/**
 * Created by tuluv on 9/6/2017.
 */
public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(100));
        System.out.println(isPrime(-4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(23));
    }

    static boolean isPrime(int n) {
        if (n < 2 || (n % 2 == 0 && n != 2))
            return false;
        else {
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }
}
