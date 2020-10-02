import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch(Exception e) {}
    }

}

public class A6 {
    
    public static void main(String[] args) {
        // 10 threads in the pool
        ExecutorService exe=Executors.newFixedThreadPool(10);
        // 50 tasks
        for(int i=0;i<50;i++) {
            exe.execute(new Task());
        }
        exe.shutdown();
        while(!exe.isTerminated()) {}
    }

}

// creating large no of threads is expensive, so, use a thread pool, where the threads are reused again and again

// pool-1-thread-4
// pool-1-thread-6
// pool-1-thread-5
// pool-1-thread-2
// pool-1-thread-3
// pool-1-thread-1
// pool-1-thread-8
// pool-1-thread-10
// pool-1-thread-9
// pool-1-thread-7
// pool-1-thread-6
// pool-1-thread-4
// pool-1-thread-7
// pool-1-thread-3
// pool-1-thread-9
// pool-1-thread-5
// pool-1-thread-2
// pool-1-thread-1
// pool-1-thread-8
// pool-1-thread-10
// pool-1-thread-4
// pool-1-thread-6
// pool-1-thread-5
// pool-1-thread-3
// pool-1-thread-9
// pool-1-thread-7
// pool-1-thread-2
// pool-1-thread-8
// pool-1-thread-10
// pool-1-thread-1
// pool-1-thread-6
// pool-1-thread-4
// pool-1-thread-3
// pool-1-thread-9
// pool-1-thread-5
// pool-1-thread-7
// pool-1-thread-10
// pool-1-thread-2
// pool-1-thread-8
// pool-1-thread-1
// pool-1-thread-6
// pool-1-thread-4
// pool-1-thread-5
// pool-1-thread-3
// pool-1-thread-9
// pool-1-thread-7
// pool-1-thread-1
// pool-1-thread-8
// pool-1-thread-10
// pool-1-thread-2
