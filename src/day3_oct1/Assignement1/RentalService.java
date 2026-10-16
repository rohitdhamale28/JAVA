package day3_oct1.Assignement1;

public class RentalService {
	
	public static void main(String[] args) {
		Customer cust = new Customer("Ram");
		Car c1 = new Car("Lamborghini",34, false);
		Bus b1 = new Bus("BMW",31, 30);
		
		Rental r = new Rental();
		r.createBooking(cust, b1, 12);
		r.generateBill();
		
		r.createBooking(cust, c1, 12);
		r.generateBill();
				

	}

}
