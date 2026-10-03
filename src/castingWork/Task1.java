package castingWork;

public class Task1 {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.eat();
		a.sleep();
		a.leg();
	
		Dog d = (Dog) a;
		d.bark();
	}
}
