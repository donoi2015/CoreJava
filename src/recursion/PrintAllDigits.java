package recursion;

public class PrintAllDigits {

    public static void main(String[] args) {
        print(2345);
    }

    static void print(int num) {
        if (num == 0) return;
        System.out.println(num % 10);
        print(num / 10);
    }
}
