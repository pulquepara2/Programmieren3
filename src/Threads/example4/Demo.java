package Threads.example4;

public class Demo {
    public static void main(String[] args) {


        Konto k1 = new Konto(100);
        Konto k2 = new Konto(200);

        Runnable w1 = new Worker('A', k1, k2);
        Runnable w2 = new Worker('B', k2, k1);

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Konto K1 sollte 100 drauf haben " + k1.getWert());
        System.out.println("Konto K2 sollte 200 drauf haben " + k2.getWert());

    }
}
