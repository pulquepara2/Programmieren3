package Threads.uebung_3_1;

import java.util.Date;

public class HintergroundThread implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}