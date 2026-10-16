package day6;

import day6_DSA.count_char;

public class GenericClass<T>{
	T obj;
	public GenericClass(T obj) {
		this.obj = obj;
	}
	
//	public Integer getType() {
//		return obj.getClass().getName();
//	}
	public String getType() {
		return obj.getClass().getName();
	}
	
	public static void main(String[] args) {
		GenericClass<Integer> iobj = new GenericClass<Integer>(100);
		System.out.println(iobj.getType());
		
		GenericClass<String> sobj = new GenericClass<String>("Test");
		System.out.println(sobj.getType());
	}
	
//	type :
//		class
//		interfac
//		primitive
//		enum

}
