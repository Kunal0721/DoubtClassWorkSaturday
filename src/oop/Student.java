package oop;

public class Student {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Invalid id !!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isBlank()) {
			this.name = name;
		} else {
			System.out.println("Name is required !!");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 5 && age <= 30) {
			this.age = age;

		} else {
			System.out.println("Invalid age !!");
		}
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
