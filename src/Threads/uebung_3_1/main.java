package Threads.uebung_3_1;

import Threads.example2_hoefliches_stoppen.ConsoleHelper;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread vom main: " + Thread.currentThread().getName());
    Runnable w1 = new Worker();
    Thread t1 = new Thread(w1);
    t1.start();
        System.out.println("Bitte drücken Sie eine Taste, um die die Threads zu Stoppen!");

        t1.start();



        if (ConsoleHelper.readLine() != null) {
            ((Worker) w1).requestShutDown();
        }
        t1.join();


    }
}