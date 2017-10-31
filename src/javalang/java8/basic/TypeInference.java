package javalang.java8.basic;

public class TypeInference {
    public static void main(String[] args) {
        TwoNumOp addition = (a, b) -> a + b;
        TwoNumOp subtraction = (a, b) -> a - b;
        System.out.println(something(addition));
        System.out.println(something(subtraction));
    }

    static int something(TwoNumOp operation) {
        return operation.add(24, 36);
    }

    interface TwoNumOp {
        int add(int a, int b);
    }
}
