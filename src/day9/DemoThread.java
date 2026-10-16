package day9;

public class DemoThread {
    public static void main(String[] args) {
        // Assuming Thread1 extends Thread (or is set up similarly)
        Thread1 t1 = new Thread1();
        t1.start();
        
        Thread2 target = new Thread2();
        Thread t2 = new Thread(target);
        t2.start();
        
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "1");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}