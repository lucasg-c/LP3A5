package main;

public class HelloWorldRunnable implements Runnable {
    @Override
    public void run()
    {
        System.out.println("Atual thread: '" + Thread.currentThread().getName() + "'\n");
    }
}
