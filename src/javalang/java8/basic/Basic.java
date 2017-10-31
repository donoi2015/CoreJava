package javalang.java8.basic;

public class Basic {
    public static void main(String[] args) {
        printStatement lambda = (s) -> System.out.println(s);
        lambda.printSomething("Hi! This is lambda");
        printStatement implementationCode = new PrintImplementation();
        implementationCode.printSomething("Hello World! It's the implementation");

    }

    static class PrintImplementation implements printStatement {
        public void printSomething(String string) {
            System.out.println(string);
        }
    }

    @FunctionalInterface
    //good practice to use this annotation so that  other
    // people won't add other methods to your interface
    public interface printStatement {
        void printSomething(String s);
    }

    //project based on javabrains tutorial at https://www.youtube.com/watch?v=suSdjhS03qk&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=24
}
