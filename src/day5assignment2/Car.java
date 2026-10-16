package day5assignment2;

public class Car extends Vehicle {
	protected boolean isLuxury;
	protected int hours;
	

	public Car(String brand, double rentalRate, boolean isLuxury)
	{
		super(brand,rentalRate);
		this.isLuxury=isLuxury;

	}

	@Override
	public double calculateRent(int hours) {
		double rate ;
		
		if(this.isLuxury ) {
			if(hours < 8) {
				rate = hours * 40;
			}
		else {
			rate = 40 * 8; // 8 hours
			hours -= 8;
			rate += hours * 50;
		}}
		
		else {
			if(hours < 8) {
				rate = hours * 25;
			}
			else {
				rate = 25 * 8; // 8 hours
				hours -= 8;}
				rate += hours * 35;
			}
			return rate;
		}
	
		@Override 
		public double calculatePremium() {
			double amount;
			if(isLuxury == true) {
				amount = 15000;
			}
			
			else {
				amount = 7000;
			}
			return amount;
				
		}
		public boolean isLuxury() {
		return isLuxury;
		}
	
		public void setLuxury(boolean isLuxury) {
		this.isLuxury = isLuxury;
		}
	
		public int getHours() {
		return hours;
		}
	
		public void setHours(int hours) {
		this.hours = hours;
		}
	
		@Override
		public String toString() {
			return "Car [ Brand: "+ this.brand + ", Rental Rate: "+ this.rentalRate + ", NameisLuxury= " + isLuxury + ", hours=" + hours + "]";
			
		}
}
