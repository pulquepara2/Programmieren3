package Threads.example1;

public class Main {
    public static void main(String[] args) {
        Person P1 = new Person("Hansi");
        Person P2 = new Person("Duchess of Carrontonia");

        Thread t1= new Thread(P1);
        Thread t2 = new Thread(P2);

        t1.start();
        t2.start();
        System.out.println("Main() ende");
//join: current thread wartet, bis der andere Thread fertig ist
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
        System.out.println("main(): beide anderen Threads sind fertig.");
    }
}
