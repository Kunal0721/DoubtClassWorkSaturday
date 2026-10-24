package multi_threading;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		//Threads methods... : 
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		Thread.currentThread().setName("raju");
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread());
		
		System.out.println("Hello world");
		Thread.sleep(1000); // 1000 ms => 10^3 m^-3s => 1s 
		System.out.println("Hello world");
		
		for(int i=1; i<=10; i++) {
			System.out.println("other work...");
			Thread.sleep(1000);
		}
//		System.out.println(Thread.State.BLOCKED);
	}
}
