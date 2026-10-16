package day3_oct1;

public class ContractEmployee extends Employee{
	protected int hrs;
	protected double wages;
	public ContractEmployee(int empid, String name, int hrs, int wages) {
		super(empid, name);
		this.hrs = hrs;
		this.wages = wages;
	}
	
	@Override
	public double calculateGross() {
		return this.wages*this.hrs;
	}
}
