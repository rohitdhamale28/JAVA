package day6;

public class Stat<T extends Number> {
	T []arr;
	public Stat(T [] arr) {
		this.arr=arr;
	}
	// Number is the super class of all 8 wraper class (Integer, String...)
	
	public double calculateAverage() {
		double total=0.0;
		for(T item :arr) {
			total+= item.doubleValue();// convert from wrapper class to double 
			
		}
		
		return total/arr.length;
	}
	public static void main(String[] args) {
		Integer [] iarr = {1,2,3,4,5,6};
		Float [] farr = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
		Stat<Integer> iobj = new Stat<Integer>(iarr);
		System.out.println(iobj.calculateAverage());
		Stat<Float> fobj = new Stat<Float>(farr);
		System.out.println(fobj.calculateAverage());
		
	}

}
