package Threads.uebung_3_1;

public class main {
    public static void main(String[] args) {
    Runnable ht = new HintergroundThread();
    Thread t1 = new Thread(ht);
    t1.start();

    }
}