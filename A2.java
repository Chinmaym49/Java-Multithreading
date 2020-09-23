public class A2 extends Thread {
    
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A2 t1=new A2();
        A2 t2=new A2();
        t1.start();
        t2.start();
    }
    
}

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