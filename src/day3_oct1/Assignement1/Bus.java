package day3_oct1.Assignement1;

public class Bus extends Vehicle {
	protected int seatingCapacity;
	
	public Bus( String brand, double rentalRate, int seatingCapacity) {
		super(brand,rentalRate);
		this.seatingCapacity = seatingCapacity;

	}
	@Override
	public double calculateRent(int hours) {
		double rate;
		if(this.seatingCapacity < 12) {
			rate = hours * 50;
		}
		else {
			rate = hours * 70;
		}
		return rate;
			
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Bus [seatingCapacity=" + seatingCapacity + "]";
	}
}
