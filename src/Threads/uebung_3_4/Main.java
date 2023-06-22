package Threads.uebung_3_4;

import Threads.example2_hoefliches_stoppen.ConsoleHelper;

public class Main {
    public static void main(String[] args) {
        // COUNTER:
        Worker w1 = new Worker();
        // Worker w2 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(" Counter zum Schluss: "+w1.counter);
    }
}


