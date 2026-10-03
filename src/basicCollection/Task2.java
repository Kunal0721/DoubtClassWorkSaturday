package basicCollection;

import marker.Student;

class Simple<Gourav>{
	Gourav data;
	
	public Simple(Gourav data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Simple [data=" + data + "]";
	}
}

public class Task2 {
	public static void main(String[] args) {
		Simple<Integer> s = new Simple<>(100);
		System.out.println(s);
		
		Simple<Double> s2 = new Simple<>(1.23);
		System.out.println(s2);
		
		Simple<String> s3 = new Simple<>("Mohit");
		System.out.println(s3);
		
		Simple<Student> st = new Simple<>(new Student("raj", 11));
		System.out.println(st);
	}
}
