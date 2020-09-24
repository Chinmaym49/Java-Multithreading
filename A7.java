class Job {
    
    public void doWork() {
        synchronized(A7.class) {        // threads are coming from A7 class
            for(int i=0;i<100;i++) {
                try {
                    Thread.sleep(50);
                } catch(Exception e) {}
                A7.shared+=1;
            }
        }
    }

}

public class A7 extends Thread {

    public static int shared=0;
    
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Job j=new Job();
        j.doWork();
    }

    public static void main(String[] args) {
        A7 t1=new A7();
        A7 t2=new A7();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch(Exception e) {}
        System.out.println(shared);
    }

}

// If many threads are simultaneously accessing same data, it may lead to inconsistency
// Hence, we can use synchronized method so that only one thread accesses that method at a time.

// Without synchronized function, output : 

// Thread-0
// Thread-1
// 174

// With synchronized function, output : 

// Thread-0
// Thread-1
// 200