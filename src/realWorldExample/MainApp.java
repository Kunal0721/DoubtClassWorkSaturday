package realWorldExample;

import java.util.LinkedList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) throws InterruptedException {
		MovieTheater theater = new MovieTheater();
		
		List<Person> p = new LinkedList<>();
		p.add(new Person("Shivam", theater));
		p.add(new Person("Arti", theater));
		p.add(new Person("Roshini", theater));
		p.add(new Person("Shivani", theater));
		p.add(new Person("Vaishnavi", theater));
		p.add(new Person("Yuvraj", theater));
		p.add(new Person("Satyam", theater));
		p.add(new Person("Rohan", theater));
		p.add(new Person("Prakash", theater));
		
		for(Person person : p) person.start();
		
		for(Person person : p) person.join();
		
	}
}
