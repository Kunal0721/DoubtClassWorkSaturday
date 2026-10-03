package listWork;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task5 {
	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("raj");
		dq.offerFirst("mohit");
		dq.offerLast("shivani");
		
		System.out.println(dq);
		
	}
}
