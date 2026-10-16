package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIST {
	public static void main(String[] args) {
		List lst = new ArrayList<>();
		lst.add(100);
		lst.add("Ram");
		lst.add(34.5f);
		lst.add(true);
		
		
		
		System.out.println(lst);
		lst.remove("Ram");
		System.out.println(lst.get(2));
//-----------------------------------------------------------		
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		for(Object item: lst) {
			System.out.println(item);
		}
//-----------------------------------------------------------			
		
		Iterator it = lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//-----------------------------------------------------------	
		//List lst = new ArrayList<>();   we should specify the data type to avoid error 
		// or use generic class concept
		// eg :
		
		// this will give error at runtime if object at index 2 is not integer
		
		Integer obj = (Integer) lst.get(2);
		//(Integer) : we have to use this to downcast to Integer class , as ls.get(2)returns a oject of list  
		
		
	}
	
}
