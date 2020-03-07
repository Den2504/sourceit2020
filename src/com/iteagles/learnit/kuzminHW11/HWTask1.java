package com.iteagles.learnit.kuzminHW11;

import java.util.concurrent.TimeUnit;

	 // Thread that prints to console its own name intervals.

	class MyThread extends Thread {
			
			private static final int PAUSE = 500;

			@Override
			public void run() {
				try {
					while (true) {
						System.out.println(getName());
						TimeUnit.MILLISECONDS.sleep(PAUSE);
					}
				} catch (InterruptedException e) {
					System.out.println("Child thread interrupted");
				}
			}
		}

		class MyThread2 implements Runnable {
			
			private static final int PAUSE = 500;
			
			@Override
			public void run() {
				try {
					while (true) {
						System.out.println(Thread.currentThread().getName());
						TimeUnit.MILLISECONDS.sleep(PAUSE);
					}
				} catch (InterruptedException e) {
					System.out.println("Thread was interrupted");
				}
			}
		}

		public class HWTask1 {

		
			public static void main(String[] args) throws InterruptedException {

				Thread t = new Thread(new MyThread2());

				t.start();
				TimeUnit.SECONDS.sleep(5);
				t.interrupt();

				MyThread t2 = new MyThread();
				t2.start();
				TimeUnit.SECONDS.sleep(5);
				t2.interrupt();
			}

		}
