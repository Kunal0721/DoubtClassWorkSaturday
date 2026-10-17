package exceptionWork;

public final class Task2 {
//	public static int work() {
//		try {
//			return 11;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Hello");
//			return 67;
//		}
//	}
	
	// final & finally & finalize
	
	public final static void simple() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		final int a = 19;
		System.out.println(a);
		System.out.println(a);
		simple();
		
	}
}
