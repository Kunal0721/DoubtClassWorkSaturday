package listWork;

import java.util.LinkedList;
import java.util.Queue;

public class Task4 {
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("ishika");
		q.offer("jayesh");
		q.offer("raj");
		q.offer("balram");
		q.offer("balram");
		q.offer("raj");
		
		System.out.println(q.peek());
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}
}
