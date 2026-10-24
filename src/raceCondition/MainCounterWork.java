package raceCondition;

public class MainCounterWork {
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		Task1 t1 = new Task1(counter);
		Task2 t2 = new Task2(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}
}
