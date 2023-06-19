package Threads;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("This code is running in a thread, Main Thread");
        System.out.println("I am inside the thread: " + Thread.currentThread().getName() + " ");
    }



}
