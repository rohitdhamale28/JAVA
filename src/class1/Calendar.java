package class1;

public class Calendar {
	public static void main(String[] args) {
		Date d1 = new Date();
		
//		public void setDate(int d,int m,int y) {
//			day=d;
//			month=m;
//			year=y;
//		}
//		this is the setDate func in class Date
		// d1.setDate(); //this return : 0/0/0 
//		as (int d,int m,int y) these arguments are primitive data types 
//		java by default the default contructor assign 0 to primitive data type 
//		and null to non-primitive data type
		Date d3 = new Date();
		d1.setDate(8, "Jan", 2026);
		Date d2 = d1;
		d1.displayDate();
		d2.displayDate();
		d3.displayDate();
		// d2 is copying the reference (heap location) of d1
	}
}

