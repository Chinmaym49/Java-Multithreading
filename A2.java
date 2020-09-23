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
        t1.start();     // Calling run() instead of start() will work like a normal function call 
        t2.start();     // It will not execute on a separate thread
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