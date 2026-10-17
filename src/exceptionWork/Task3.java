package exceptionWork;

public class Task3 {
	
	public static void company(int age) {
		if(age >= 18) {
			System.out.println("Welcome to the company...");
		}
		else {
			throw new RuntimeException("Invalid Age...");
//			System.out.println("Invalid age...");
		}	
	}
	
	public static void main(String[] args) {
		company(8);
		System.out.println("Your new assignment would be...");
	}
}
