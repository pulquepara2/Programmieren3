package Threads.uebung_3_3;

import Threads.example2_hoefliches_stoppen.ConsoleHelper;

public class Main {
    public static void main(String[] args) {
        Worker33 w = new Worker33();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);

        t1.start();
        t2.start();
    }

}
