package com.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
	private static Future taskTwo;
	private static Future taskThree;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create a thread pool of two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		//execute the runnable 
		Runnable taskOne = new MyThread("taskOne", 2, 1000);
		executor.execute(taskOne);
		
		for (int i = 0; i < 4; i++) {
			// if this task is not created or is canceled or is completed
			if (taskTwo == null || taskTwo.isCancelled() || taskTwo.isDone()) {
				// submit a task and return a Future
				taskTwo = executor.submit(new MyThread("taskTwo", 4, 2000));
			}
			
			if (taskThree == null || taskThree.isCancelled() || taskThree.isDone()) {
				taskThree = executor.submit(new MyThread("taskThree", 5, 3000));
			}
			
			//if null the task has been finished
			if (taskTwo.get() == null) {
				System.out.println(i+1 + ") TaskTwo terminated successfully");
			} else {
				//if doesn't finished , cancel it.
				taskTwo.cancel(true);
			}
			
			if (taskThree.get() == null) {
				System.out.println(i+1 + ") TaskThree terminated successfully");
			} else {
				taskThree.cancel(true);
			}
		}
		
		executor.shutdown();
		System.out.println("-----------------------");
		// wait until all tasks are finished
		executor.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("All tasks are finished!");
	}
}
