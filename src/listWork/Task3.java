package listWork;

import java.util.Set;
import java.util.TreeSet;

public class Task3 {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<>();
		
		s.add("raj");
		s.add("mohan");
		s.add("anirudh");
		s.add("raj");
		s.add("shivam");
		s.add("raghav");
		
		System.out.println(s);
		
	}
}
