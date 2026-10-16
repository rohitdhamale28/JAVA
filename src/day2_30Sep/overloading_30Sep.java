package day2_30Sep;

public class overloading_30Sep {
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public static void add(int num1, float num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(float num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
//	TAKING VARIABLE NUMBER OF ARGUMENTS
	
	public static void addition(int...num) {
		int total = 0;
		for(int n: num) {
			total += n;
		}
		System.out.println(total);
	}
		
	public static void main(String[] args) {
		overloading_30Sep.add(12,13);
		overloading_30Sep.add(12,13,14);
		overloading_30Sep.add(12.5f,13);
		overloading_30Sep.add(12,13.1f);
		

		overloading_30Sep.addition(12,13,14,15,16);

	}

}
