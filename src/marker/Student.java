package marker;

public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

interface Monitor {
}

class StudentMonitor extends Student implements Monitor {

	public StudentMonitor(String name, int age) {
		super(name, age);
	}

}
