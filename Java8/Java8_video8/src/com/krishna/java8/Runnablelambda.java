package com.krishna.java8;

public class Runnablelambda {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hare krishna in run method");

			}
		});

		thread.run(); 
		// This doesn't start new thread for that, i should have actually used Thread.start()
		thread.start();
		
		// Using Lambda we can write above code as below
		
		Thread lambdaThread = new Thread(() -> System.out.println("Hare krishna in lambda Thread") );
		
		lambdaThread.run();
		lambdaThread.start();
	}
}
