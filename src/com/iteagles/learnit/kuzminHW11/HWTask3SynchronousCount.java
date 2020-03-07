package com.iteagles.learnit.kuzminHW11;

import java.util.concurrent.TimeUnit;

public class HWTask3SynchronousCount implements Runnable{
	public int counter1 = 0;
	public int counter2 = 0;	
	public int counter3 = 0;
	
	public synchronized void run() {
		try {
			while (true) {
				System.out.println(counter1 + " == " + counter2 + " == " + counter3);
				counter1++;
				TimeUnit.MILLISECONDS.sleep(10);
				counter2++;
				TimeUnit.MILLISECONDS.sleep(10);
				counter3++;
				TimeUnit.MILLISECONDS.sleep(10);
			}
	} catch (InterruptedException e) {
		System.out.println("Thread was interrupted");
	}

}
}
