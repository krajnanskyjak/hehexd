package pp.threadtest;
import static pp.threadtest.Main.i;

public class Thread2 extends Thread {
    @Override
    public void run() {
        while (i < 100000) {

            System.out.println("Thread2:" + i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
    }
}
