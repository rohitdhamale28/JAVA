package day3_oct1;

public class payRoll {
	public static void displayGross(Employee e) {
		System.out.println("Welcome "+ e.name);
		System.out.println("------Salary Slip------");
		System.out.println("*********************");
		System.out.println("Gross:    "+ e.calculateGross());
		System.out.println("*********************");
		System.out.println();
		
	}
}
