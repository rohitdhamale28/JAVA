package day5;

import java.util.ArrayList;
import java.util.List;

public class DemoConversions {
	public static void main(String[] args) {
		int i = 30;
		Integer j = Integer.valueOf(i); // primitive to wrapper integer
		
		int k = j.intValue(); // wrapper to primitive
		
		System.out.println(i+ ", "+j+", "+k);
		
		
		// String to Primitive 
		// String to Wrapper
		
		String s = "30";
		int a = Integer.parseInt(s);
		Integer b = Integer.valueOf(s);
		System.out.println(s+", "+a+", "+b);
		
		
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		
		int total = 0;
		for(Integer val: ilist) {
			total += val;
		}

		// Java 5 and above
		int x = 20;
		Integer y = x; // auto boxing
		int z = y; // auto unboxing
	}
}
