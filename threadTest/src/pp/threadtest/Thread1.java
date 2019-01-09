package pp.threadtest;

import static pp.threadtest.Main.i;

public class Thread1 extends Thread {
    @Override
    public void run() {
        while(i <= 100000) {
            System.out.println("Thread1:" + i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
