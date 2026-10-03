package listWork;

import java.util.PriorityQueue;

public class Task6 {
	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<String>();

		p.offer("raj");
		p.offer("abhishek");
		p.offer("harsh");
		p.offer("bhumi");
		p.offer("piyush");
		
		System.out.println(p);

		while (!p.isEmpty())
			System.out.println(p.poll());
	}
}
