package day3_oct1;

public class Manager extends SalariedEmployee{
	protected double allowance;
	public Manager(int empid, String name, double basic, double allowance) {
		super(empid,name,basic);
		this.allowance = allowance;
		
	}
	
	@Override
	public double calculateGross() {
		return super.calculateGross() + allowance;
	}
}
