package day6;

import java.util.*;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 100);
		map.put("two", 200);
		map.put("three", 300);
		map.put("four", 400);
		
		System.out.println(map);
		
		map.remove("four");
		System.out.println(map);
		
		System.out.println(map.get("one"));
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key+" , "+map.get(key));
			
			Set<Entry<String,Integer>> entries = map.entrySet();
			
			for(Entry<String, Integer> entry: entries) {
				System.out.println(entry.getKey()+" , "+entry.getValue());
			}
		}
	}

}
