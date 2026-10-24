package multi_threading;

class Work1 extends Thread {
	@Override
	public void run() {
		int ar[] = { 11, 71, 18, 21 };
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Work 1 : " + i + " , " + ar[i]);
		}
	}
}

class Work2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Work 2 : " + i);
		}
	}
}

public class MainWork {
	public static void main(String[] args) {

		Work1 w1 = new Work1();
		Work2 w2 = new Work2();

		w1.start();
		w2.start();
	}
}
