package exceptionWork;

public class Task1 {
	public static void main(String[] args) {

		try {
			int ar[] = { 1, 2, 3, 4 };
			System.out.println(ar[11]);
			System.out.println("Hello world...");
	
		} catch (Exception e) {
			e.printStackTrace(); // detail information
		} finally {
			System.out.println("Hello simple..");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("Other work....");
		}
	}
}
