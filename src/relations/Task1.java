package relations;

class Marks{
	double hindi;
	double english;
	double maths;
}

class Address{
	String city;
	String state;
	int pincode;
}

class Student{
	String name;
	int age;
	int rollno;
	Marks marks = new Marks();
	Address address = new Address();
}

public class Task1 {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Yuvraj";
		s.age = 19;
		s.rollno = 101;
		s.marks.english = 98;
		s.marks.maths= 98;
		s.marks.hindi= 98;
		s.address.city = "indore";
		s.address.state = "MP";
		s.address.pincode = 452011;
		
		
	}
}
