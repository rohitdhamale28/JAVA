package class1;
import java.util.Scanner;

public class Student {
	private String name;
	private int [] marks;
	private int rollno;
	
	public Student() {
		this (1, "Ram",new int[]{0, 2}); // WRITE new int [] when initializing array attribute of a object 
	}
	
	public Student(int rollno, String name, int []marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void setMarks(int []marks) {
		this.marks = marks;
	}
	
	public int []getMarks() {
		return this.marks;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public int getRollno() {
		return this.rollno;
	}
	
	public String toString() {
		return "Id: "+rollno+ " Name: "+name+ " Marks: "+marks;
	}
	
	public int totalMarks() {
		int total=0;
		for(int i : this.getMarks()) {
			System.out.println(i);
			total +=i;
		}
		return total;
	}
	
	public int avgMarks() {
		int total=this.totalMarks();
		int avg=total/5;
		
		return avg;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Student s1= new Student();
		
		System.out.println("Enter name: ");
		String name = sc.next();
		s1.setName(name);
		System.out.println("Enter Roll no: ");
		int roll = sc.nextInt();
		s1.setRollno(roll);
		
		System.out.println("Enter Marks For 5 Subject ");
		int []a=new int[5];
		for(int i=1;i<6;i++){
			System.out.println("Subject "+i+":");
			a[i-1] = sc.nextInt();
		}
		s1.setMarks(a);


		int total=s1.totalMarks();
		int avg = s1.avgMarks();
		System.out.println("Total Marks: "+total);
		System.out.println("Total Avg: "+avg);
		
		
		
		sc.close();
	}
	
}
