package javalang.java8.basic;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {

            @Override public void run() {
                System.out.println("In thread 1");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("In thread 2 using lambda expression"));
        //works because runnable has only one method signature

        thread1.start();
        thread2.start();
    }
}
