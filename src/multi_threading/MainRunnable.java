package multi_threading;

public class MainRunnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i=1; i<=10; i++) {
				System.out.println("Working 1 " +  i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1; i<=10; i++) {
				System.out.println("Working 1 " +  i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
