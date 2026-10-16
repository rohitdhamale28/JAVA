package day4;


public class DemoObjectMethods {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Car c1 = new Car(123,"Honda","Elevate");
		Car c2 = new Car(1234,"Honda","Elevate");
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		Car c3 = c1;
		System.out.println(c3); // shallow copy
		
		//Deep copy
		Car c4 = new Car(c1.getId(),c1.getMake(),c1.getModel());
		Car c5 = (Car)c1.clone();
				
				
		c1.setModel("City");
		
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}

}

