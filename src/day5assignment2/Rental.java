package day5assignment2;

public class Rental {
	private Customer customer;
	private Vehicle vehicle;
	private int rentalHours;

	public void createBooking(Customer customer, Vehicle vehicle, int rentalHours) {
		this.rentalHours = rentalHours;
		this.customer = customer;
		this.vehicle = vehicle;
	}

	public void generateBill() {
		double totalRent = vehicle.calculateRent(rentalHours);
		System.out.println("customername :" + customer.getName());
		System.out.println("vehicleReg :" + vehicle.getRegno());
		System.out.println("Totalrent :" + totalRent);
	}
}