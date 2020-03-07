package com.iteagles.learnit.kuzminHW11;

import java.util.concurrent.TimeUnit;

public class HWTask3  {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable run = new HWTask3AsynchronousCount();
		Thread AsynchT1 = new Thread(run);
		Thread AsynchT2 = new Thread(run);
		Thread AsynchT3 = new Thread(run);
		AsynchT1.start();
		AsynchT2.start();
		AsynchT3.start();
		
		TimeUnit.SECONDS.sleep(3);

		AsynchT1.interrupt();
		AsynchT2.interrupt();
		AsynchT3.interrupt();

		Runnable run2 = new HWTask3SynchronousCount();
		Thread synchT1 = new Thread(run2);
		Thread synchT2 = new Thread(run2);
		Thread synchT3 = new Thread(run2);
		synchT1.start();
		synchT2.start();
		synchT3.start();

		TimeUnit.SECONDS.sleep(3);

		synchT1.interrupt();
		synchT2.interrupt();
		synchT3.interrupt();
	}

}
