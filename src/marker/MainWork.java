package marker;

public class MainWork {
	public static void main(String[] args) {

		Student s[] = new Student[4];
		s[0] = new Student("Somesh", 19);
		s[1] = new StudentMonitor("Raj", 19);
		s[2] = new Student("Ramesh", 19);
		s[3] = new StudentMonitor("Raghav", 19);

		for (Student st : s)
			System.out.println(st);
		
		System.out.println();
		
		for(Student st : s) {
			if(st instanceof Monitor) {
				System.out.println("Monitor "  + st);
			}
		}

	}
}
