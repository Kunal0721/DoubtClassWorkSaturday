package basic;

public class Task1 {
	
	int x = 100;
	
	static int i = 190;
	
	public static void main(String[] args) throws InterruptedException {
		int a = 10;
		System.out.println(a);
		
		Task1 t = new Task1();		
		System.out.println(t.x);
		
		Thread.sleep(1000);
		
		System.out.println(i);
		
		
	}
}
