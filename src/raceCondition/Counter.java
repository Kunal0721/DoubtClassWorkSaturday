package raceCondition;

public class Counter {
	private int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

class Task1 extends Thread{
	private Counter counter;
	
	public Task1(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			counter.increment();
		}
	}
}

class Task2 extends Thread{
	private Counter counter;
	
	public Task2(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			counter.increment();
		}
	}
}
