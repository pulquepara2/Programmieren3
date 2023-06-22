package Threads.uebung_3_2;

import Threads.example2_hoefliches_stoppen.ConsoleHelper;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread vom main: " + Thread.currentThread().getName());
    Runnable w1 = new Worker();
    Runnable w2 = new Worker();
    Thread t1 = new Thread(w1);
    Thread t2 = new Thread(w2);

    t1.start();
    t2.start();
        System.out.println("Bitte drücken Sie eine Taste, um die die Threads zu Stoppen!");

        if (ConsoleHelper.readLine() != null) {
            ((Worker) w1).requestShutDown();
        }
       t1.join();
       t2.join();



    }
}