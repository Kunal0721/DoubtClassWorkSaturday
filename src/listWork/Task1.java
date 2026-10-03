package listWork;

import java.util.List;
import java.util.Vector;

public class Task1 {
	public static void main(String[] args) {
		List<String> ls = new Vector<>();
		ls.add("raj");
		ls.add("rohit");
		ls.add("rohan");
		ls.add("shivam");
		ls.add("raj");
		ls.add("raghav");
		
		System.out.println(ls);
		System.out.println(ls.get(0));
		ls.set(0, "roshini");
		System.out.println(ls);
		
		for(String s : ls) {
			System.out.println(s);
		}
	
	}
}
