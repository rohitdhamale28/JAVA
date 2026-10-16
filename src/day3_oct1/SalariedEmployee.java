package day3_oct1;

public class SalariedEmployee extends Employee{
	protected double basic;
	
	
	public SalariedEmployee(int empid, String name, double basic) {
		super(empid,name);
		this.basic = basic;
	}
	
	@Override
	public double calculateGross() {
		double hra = basic * 0.4;
		double da = basic * 0.15;
		return basic + hra + da;
		
	}
	
	public double calculateNet() {
		double pf = basic * 0.12;
		double gross = this.calculateGross();
		return gross - pf;
	}
}
