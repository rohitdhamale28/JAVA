package day5assignment2;

public abstract class Vehicle implements InsurancePolicy {
	protected int regno;
	protected static int count = 0;
	protected String brand;
	protected double rentalRate;
	
	public Vehicle(String brand, double rentalRate) {
	this.regno = ++count;
	this.brand = brand;
	this.rentalRate = rentalRate;
	}
	
	public abstract double calculateRent(int hours);
	public abstract double calculatePremium();
	
//	@Override
	public String toString() {
	return "Vehicle [regno=" + regno + ", brand=" + brand +
	", rentalRate=" + rentalRate + "]";
	}
	
	public int getRegno() {
	return regno;
	}
	
	public void setRegno(int regno) {
	this.regno = regno;
	}
	
	public String getBrand() {
	return brand;
	}
	
	public void setBrand(String brand) {
	this.brand = brand;
	}
	
	public double getRentalRate() {
	return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
	this.rentalRate = rentalRate;
	}

}