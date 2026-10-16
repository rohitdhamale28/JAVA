package day4;

public class Car implements Cloneable {
	private int id;
	private String make;
	private String model;
	public Car(int id, String make, String model) {
		this.id = id;
		this.make = make;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Performs a field-by-field shallow copy
    }
	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		Car other = (Car)obj;
		if(this.id==other.id && this.make.equals(other.make) && this.model.equals(other.model))
		return true;
		else;
		return false;
		
	}
	@Override
	public int hashCode()
	{
		int prime = 13;
		return id * prime +(make.hashCode() + model.hashCode());
	}
	
	

}
