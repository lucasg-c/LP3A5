package main;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Estamos na thread: '" + Thread.currentThread().getName() + "'\n");
		Runnable runnable = new HelloWorldRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		class CountingThread extends Thread
		{
			public void run()
			{
				for (int x = 0; x < 500000; x++)
				{
					if (x == 1000)
					{
						System.out.println("Passou na thread.");
					}
				}
			}
		}
		
		CountingThread t1 = new CountingThread();
		CountingThread t2 = new CountingThread();
		t1.start();
		t2.start();
		
		Thread t3 = new Thread( () -> System.out.println("\nHello world Lambda") );
		t3.start();
	}	
}
