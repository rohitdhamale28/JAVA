package class1;

public class Date {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private int day;
	private String month;
	private int year;
	
//  default constructor : java has a inbuilt default constructor which assign 0 to primitive data type 
//	and null to non-primitive data type 
//	but if we define a constructor (parameterized / non-parameterized) , the java(jvm) doesn't provide any default constructor
//	then everytime while initialling we should use the constructor which we have defined , as there is no default constructor
	
	
	
//	we can also define default constructor, to set the default values we want  


	public Date() {
//		day = 1;
//		month = "Jan";
//		year = 2026;
		this(1,"Jan",2026);
	}

// parameterized constructor
	public Date(int d,String m,int y) {
		day=d;
		month=m;
		year=y;
	}
	
	
//	this : points the instance variables of that object 
	public void newDate(int day,String month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
		
//	public void setDate(int d,String m,int y) {
//		day=d;
//		month=m;
//		year=y;
//	}
	
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

//	getter n setter :
	
	public void setDay(int day) {
		if(day>0 && day<31)
			this.day=day;
	}
	
	public void setDate(int day, String month, int year) {
		if(day>0 && day<31)
			this.day=day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
//  toString : method returns string itself.
	public String toString(){
		return day+"/"+month+"/"+year;
	}
	
	
}
