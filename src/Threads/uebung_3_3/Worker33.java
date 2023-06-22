package Threads.uebung_3_3;

public class Worker33 implements Runnable {
    private static int counter = 0;
    private static Object Lock = new Object();

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Lock) {
                if (counter > 20){break;}
                System.out.println(Thread.currentThread().getName() +
                        " " + counter);
                counter++;
            }
        }
    }
}
