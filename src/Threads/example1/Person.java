package Threads.example1;

public class Person implements Runnable{
    private String name;

    public Person(String name){
        this.name = name;
        System.out.println("Konstruktor von Klasse 'Person':  + \"" + name + "\" angelegt");
    }

    @Override
    public void run() {
        System.out.println("Klasse Person ('" + name + "), run() aufgerufen.");
        for(int i= 0; i <=10; i++){
            System.out.println(name + " " + Thread.currentThread().getName() + " " + +i);

            try {
             //   Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void requestShutDown() {
    }
}
