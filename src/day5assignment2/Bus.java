package day5assignment2;


public class Bus extends Vehicle {
	protected int seatingCapacity;

	public Bus(String brand, double rentalRate, int seatingCapacity) {
		super(brand, rentalRate);
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public double calculateRent(int hours) {
		double rate;
		if (this.seatingCapacity < 12) {
			rate = hours * 50;
		} else {
			rate = hours * 70;
		}
		return rate;
	}

	@Override 
	public double calculatePremium() {
		double amount;
		if(seatingCapacity > 12) {
			amount = 18000;
		}
		
		else {
			amount = 10000;
		}
		return amount;
	}
			
	
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Bus [Brand: "+ this.brand + ", Rental Rate: "+ this.rentalRate + ", seatingCapacity " + seatingCapacity + "]";
	}
}



