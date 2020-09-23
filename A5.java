public class A5 extends Thread {
    
    public void run() {
        for(int i=0;i<5;i++) {
            try{
                Thread.sleep(10);
            } catch(Exception e) {}
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }

    public static void main(String[] args) {
        A5 ndt=new A5();
        ndt.setName("non-daemon");
        ndt.start();

        A5 dt=new A5();
        dt.setName("daemon");       // low pr threads that assist user/non-daemon threads. If there are no user threads, JVM kills daemon thread 
        dt.setDaemon(true);
        dt.start();
    }

}

// If we start both ndt and dt, output : 

// non-daemon      0
// daemon  0
// daemon  1
// non-daemon      1
// daemon  2
// non-daemon      2
// daemon  3
// non-daemon      4
// daemon  4

// If we start ndt but not dt, output : 

// non-daemon      0
// non-daemon      1
// non-daemon      2
// non-daemon      3
// non-daemon      4

// If we start just dt but not ndt, output : 


// Yes, no output because there are no user threads, so the there is no need of daemon thread
// Hence, JVM kills it
// And even if it outputs something, it is just because the main thread(user thread) took some time to finish
// So, it may output "daemon    0" and nothing else because the main thread was still running for that amount of time
