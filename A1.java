public class A1 extends Thread {

    public void run() {
        System.out.println("Thread running!");
    }

    public static void main(String[] args) {
        A1 t=new A1();
        t.start();
    }

}