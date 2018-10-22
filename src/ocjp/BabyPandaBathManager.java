package ocjp;

/**
 * @author ts-tuluv.battulga
 */

import java.util.concurrent.*;
import java.util.stream.*;

public class BabyPandaBathManager {
    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle exception
        }
    }

    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean!"));// u1
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1, i -> 1) // u2
            .limit(12).forEach(i -> service.submit( // u3
            () -> await(cb))); // u4
        service.shutdown();
    }
}

//It outputs Clean! at least once.
//It outputs Clean! four times.
//The code will not compile because of line u1.
//The code will not compile because of line u2.
//The code will not compile because of line u3.
//The code will not compile because of line u4.
//It compiles but throws an exception at runtime.
//It compiles but waits forever at runtime.