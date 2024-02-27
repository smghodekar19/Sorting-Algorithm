package com.enterprise.shubhzz.multithreading;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorsImpl {
	public static volatile int TaskNumber =1;
public static void main(String[] args) {
	ExecutorService executor = Executors.newFixedThreadPool(2, new ThreadFactoryImpl());
	
	ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
	
	ExecutorService cachedThreadExecutor = Executors.newCachedThreadPool();
	
	ExecutorService scehduledThreadExecutors = Executors.newScheduledThreadPool(3);
	
//	ExecutorService executor = Executors.newFixedThreadPool(2);
	
	for(int i=0; i<10; i++) {
		executor.execute(() -> {
			System.out.println("Thread execution started: " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
				System.out.println("Thread execution completed: " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread execution Intruppted :" + Thread.currentThread().getName());
//				e.printStackTrace();
			}
			
		});
		
		if(i>5) {
			executor.shutdown();
			break;
		}
	}
	
}
}

class ThreadFactoryImpl implements ThreadFactory{

	AtomicInteger counter = new AtomicInteger(0);
	@Override
	
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
//		System.out.println("Thread is getting created");
		Thread t1 = new Thread(r);
		t1.setName("New Thread : "+ this.counter.getAndIncrement());
		return t1;
	}
	
}
