package day5assignment2;

public class PolicyApp {

	public static void main(String[] args) {
		Car c1 = new Car("Ferrari", 1000, false);
		Car c2 = new Car("Lamborghini", 800, true);
		Bus b1 = new Bus("Royal", 50, 30);
		Bus b2 = new Bus("CityBus", 20, 10);
		
		System.out.println(c1);
		System.out.println("Premium: " + c1.calculatePremium());
		System.out.println(c2);
		System.out.println("Premium: " + c2.calculatePremium());
		System.out.println(b1);
		System.out.println("Premium: " + b1.calculatePremium());
		System.out.println(b2);
		System.out.println("Premium: " + b2.calculatePremium());
		
	}

}