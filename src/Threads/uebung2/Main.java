package Threads.uebung2;

import Threads.example2_hoefliches_stoppen.ConsoleHelper;


public class Main {
    public static void main(String[] args) {
    TimePrintWorker tpw1 = new TimePrintWorker("Klaus");
    Thread t1 = new Thread(tpw1);
    FileReadWorker frw = new FileReadWorker("Hansl", "C:\\Users\\s53033\\Documents\\uebung2.txt");
    Thread t2 = new Thread(frw);

    t1.start();
    t2.start();

        if (ConsoleHelper.readLine() != null) {
            tpw1.stopWorker();
            frw.stopWorker();
        }
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
