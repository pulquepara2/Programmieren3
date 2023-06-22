package Threads.uebung_3_2;

import java.util.Date;

public class Worker implements Runnable {
    public Worker() {
    }

    private boolean isRunning = true;
    private static Object printlock = new Object();
    //Object muss static sein, eine Variable für alle!
    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("thread von worker: " + Thread.currentThread().getName());
        synchronized (printlock) {
            for (int i = 0; i <= 10; i++) {
                Date d = new Date();
                System.out.println(Thread.currentThread().getName());
                System.out.print("[");
                System.out.println(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (isRunning == false) {
                    return;
                }
            }
        }
    }

}