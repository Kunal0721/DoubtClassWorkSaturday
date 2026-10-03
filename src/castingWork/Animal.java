package castingWork;

public interface Animal {
	public void eat();

	public void sleep();

	public void leg();
}

class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eating padegerii");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping for 10 hours");
	}

	@Override
	public void leg() {
		System.out.println("Animal has 4 leg");
	}
	
	public void bark() {
		System.out.println("Dog is barking..");
	}
}