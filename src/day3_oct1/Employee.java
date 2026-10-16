package day3_oct1;

public abstract class Employee { // Added 'abstract' here!
    protected int empid;
    protected String name;
    
    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
    
    // Abstract method: forces subclasses to provide their own implementation
    public abstract double calculateGross();
    
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + "]";
    }

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}