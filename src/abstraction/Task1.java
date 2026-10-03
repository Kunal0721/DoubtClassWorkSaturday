package abstraction;

abstract class Animal {

	// abstract method
	public abstract void eat();

	// concrete method or normal method
	public void sleep() {
		System.out.println("Sleeping for 10 hours..");
	}
}

class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Eating fish");
	}

}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Eating Padegerrii");
	}

}

public class Task1 {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
		
	}
}
