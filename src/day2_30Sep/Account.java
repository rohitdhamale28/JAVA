package day2_30Sep;
import  class1.Date;



public class Account {
	private int accid;
	private String name;
	private double balance;
	private Date joiningdate;
	
//	static attributes are accessed directly using class name , we don't need a object to access a static member	
	private static float intrate;
	static {
		intrate=6.5f;
	}
	static {
		System.out.println("Block 2");
	}
	
	public Account(int accid,String name,double balance,Date joiningdate) {
		this.accid=accid;
		this.name=name;
		this.balance=balance;
		this.joiningdate=joiningdate;
	}
	
	
	public void calculateInstrest() {
		double intrest= (balance*intrate*0.4);
		System.out.println("Interest: "+intrest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAccid() {
		return accid;
	}



	public void setAccid(int accid) {
		this.accid = accid;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}

}
