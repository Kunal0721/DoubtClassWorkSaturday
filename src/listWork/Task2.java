package listWork;

import java.util.Stack;

public class Task2 {
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		s.push("mohit");
		s.push("sumit");
		s.push("raj");
		s.push("roshini");
		s.push("raj");
		
//		System.out.println(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
