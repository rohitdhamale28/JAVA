package day6;

import java.util.*;

public class DemoSetd {

	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println(set);
		
		set.remove("two");
		System.out.println(set);
		
		System.out.println(set.contains("one"));
		
		System.out.println("==================================================");
		
		
		for (String s:set) {
			System.out.println(s);
		}
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
