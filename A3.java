public class A3 extends Thread {

    public void run() {
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A3 t1=new A3();
        t1.start();
        try { 
            t1.join();              // pauses main thread until completely executed
        } catch(Exception e) {}
        A3 t2=new A3();
        A3 t3=new A3();
        t2.start();
        t3.start();
    }

}

// 0
// 1
// 2
// 3
// 4
// 0
// 0
// 1
// 1
// 2
// 2
// 3
// 3
// 4
// 4