package day2_30Sep;
import  class1.Date;
public class Branch {

	public static void main(String[] args) {
		Date d1= new Date(01,"Jan",2026); 
		Account acc= new Account(1,"Pranshuii",100000.00,d1);
		
		acc.calculateInstrest();
	}

}
