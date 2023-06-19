package Threads;

public class Multithread {
    public static void main(String[] args)
    {
        int n = 2; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}
