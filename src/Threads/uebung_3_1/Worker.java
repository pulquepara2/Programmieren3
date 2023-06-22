package Threads.uebung_3_1;

import java.util.Date;

public class Worker implements Runnable {
    public Worker() {
    }

    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("thread von worker: " + Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(isRunning == false){
                return;
            }
        }
    }

}