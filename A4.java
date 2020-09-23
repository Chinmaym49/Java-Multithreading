public class A4 extends Thread {
    
    public void run() {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        A4 t1=new A4();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("th1");
        System.out.println(t1.getName());
        
        A4 t2=new A4();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        t2.setName("th2");
        System.out.println(t2.getName());

        // min pr - 1
        // max pr - 10
        // default pr - 5

        t1.setPriority(7);
        t2.setPriority(1);
        t2.start();
        t1.start();

    }

}

// 13
// Thread-0
// th1
// 14
// Thread-1
// th2
// 14
// 13
// th1
// th2
// 1
// 7
// Thread running!
// Thread running!