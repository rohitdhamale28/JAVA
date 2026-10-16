package day2_30Sep;

import class1.Date;

public class Car {
	private static int count = 0;
	private int cid;
	private String name;
	private double price;

	private Car(String name, double price) {
		this.cid = ++count;
		this.name = name;
		this.price = price;

	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		Car c1 = new Car("Altroz", 1400000);
		Car c2 = new Car("Altroz2", 1300000);
		Car c3 = new Car("Altroz1", 1200000);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
