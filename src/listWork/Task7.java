package listWork;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(101, "rohit");
		m.put(102, "raj");
		m.put(103, " ");
		m.put(105, "rohit");
		
		System.out.println(m);

		m.put(101, "rakesh");
		
		System.out.println(m);
		
		m.putIfAbsent(103, "raghav");
		
		System.out.println(m);
		
//		m.put(null, null)
	}
}
