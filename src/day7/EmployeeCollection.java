package day7;

import day3_oct1.*;
import java.util.*;

public class EmployeeCollection {
	
	public static void printList(List<? extends Employee> emplist) {
		for (Employee e : emplist) {
			System.out.println(e);
		}
	}

	// Generic method with a bounded type parameter: 
	// T can be Employee or any subclass of Employee (like SalariedEmployee, Manager)
	public static <T extends Employee> void addEmployee(List<T> emplist, T e) {
		for (T emp : emplist) {
			if (emp.getEmpid() == e.getEmpid()) {
				System.out.println("Duplicated Employee: " + e.getName());
				return; // Exit method so duplicate is not added
			}
		}
		emplist.add(e); // Actually add the employee if no duplicate is found
	}

	public static void main(String[] args) {
		// List of general Employee objects holding subclasses
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new SalariedEmployee(3545, "aaa", 80000));
		emplist.add(new Manager(35458, "mmmm", 10000, 1000));
		
		EmployeeCollection.addEmployee(emplist, new SalariedEmployee(56, "abc", 60000));
		System.out.println("--- Employee List ---");
		EmployeeCollection.printList(emplist);
		
		// List strictly for Managers
		List<Manager> mlist = new ArrayList<Manager>();
		mlist.add(new Manager(4567, "ppp", 90000, 8000));
		mlist.add(new Manager(1234, "ccc", 80000, 7000));
		
		// Adding a new Manager using the generic method
		EmployeeCollection.addEmployee(mlist, new Manager(4687, "rrr", 70000, 6000));
		
		System.out.println("--- Manager List ---");
		EmployeeCollection.printList(mlist);
	}
}