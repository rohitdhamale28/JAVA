package day2_30Sep;

import java.util.Scanner;

public class Scanner_30sept {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println(name);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.close();
	}

}
