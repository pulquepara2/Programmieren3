package Threads.uebung2;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    protected void work() {
        while (shouldRun == true){
            printStarted();
            Date d = new Date();
            System.out.println(d.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printStopped();
        }
    }

    @Override
    public void run() {
        work();
        }
    }

