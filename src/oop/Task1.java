package oop;

class Animal {
	public void eat() {
		System.out.println("eating human");
	}

	public void sleep() {
		System.out.println("sleeping for 10 hours");
	}

	public void leg() {
		System.out.println("Animal has four leg");
	}
}

class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("eating padeggeri");
	}
	
	public void bark() {
		System.out.println("Dog is barking...");
	}
}

public class Task1 {
	public static void main(String[] args) {
		Animal a = new Dog();  // upcasting 
		Dog d = (Dog) a;   // downcasting 
		d.bark();
	
	}
}
