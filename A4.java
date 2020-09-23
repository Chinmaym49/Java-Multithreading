public class A4 extends Thread {
    
    public void run() {
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        A4 t=new A4();
        System.out.println(t.getId());
        System.out.println(t.getName());
        t.setName("th1");
        System.out.println(t.getName());
        t.start();
    }

}

// 13
// Thread-0
// th1
// 13
// th1
// Thread running!