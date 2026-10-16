package day5assignment2;

public class RentalService {
	public static void main(String[] args) {
		Customer cust = new Customer("Aman Don");
		Car c1 = new Car("Altros", 34, false);
		Bus b1 = new Bus("Royal", 31, 30);
		Rental r = new Rental();
		r.createBooking(cust, b1, 12);
		r.generateBill();
		r.createBooking(cust, c1, 12);
		r.generateBill();
	}
}