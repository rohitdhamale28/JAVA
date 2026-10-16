package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.*;

public class EmployeeCollection {
	
	public static List<Employee> initializeData(){
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(656, "aaa", 80000, Set.of("Java", "Javascript")));
		emplist.add(new Employee(102, "John Doe", 95000, Set.of("Java", "Spring Boot", "SQL")));
		emplist.add(new Employee(345, "Jane Smith", 110000, Set.of("Python", "AWS", "Docker")));
		emplist.add(new Employee(789, "Alex Jones", 75000, Set.of("HTML", "CSS", "Javascript", "React")));
		emplist.add(new Employee(214, "Emily Davis", 125000, Set.of("Go", "Kubernetes", "Java")));
		return emplist;
	}
	// IMP topic for labexam (Collection Strings and Lambda)

	public static void addEmployee(List<Employee> emplist, Employee e) {
		for(Employee emp : emplist) {
			if (emp.getEmpid() == e.getEmpid()){
				System.out.println("Duplicate Employee");
				return; // Exit so duplicate is not added
			}
		}
		emplist.add(e);
	}
	
	public static void removeEmployee(List<Employee> emplist, Employee e) {
		Iterator<Employee> it = emplist.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpid() == e.getEmpid()){
				it.remove();
				break;
			}
		}
	}
	
	public static List<Employee> filterBySkill(List<Employee> emplist, String s) {
		List<Employee> filtered = new ArrayList<Employee>();
		for(Employee e: emplist) {
			if(e.getSkills().contains(s)) {
				filtered.add(e);
			}
		}
		return filtered;
	}
	
	public static Map<Integer,Double> getSalaryMap(List<Employee> emplist) {
		Map<Integer,Double> salmap = new TreeMap<Integer,Double>();
		for(Employee e: emplist) {
			salmap.put(e.getEmpid(), e.getSalary() * 0.2);
		}
		return salmap;
	}
	
	public static void printList(List<Employee> emplist) {
		for(Employee e: emplist) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emplist = EmployeeCollection.initializeData();
		EmployeeCollection.addEmployee(emplist, new Employee(102, "John Doe", 95000, Set.of("Java", "Spring Boot", "SQL")));
		System.out.println(emplist);
		EmployeeCollection.addEmployee(emplist, new Employee(349, "Janeye", 10000, Set.of("Python", "R", "Java")));
		System.out.println(emplist);
		
		System.out.println("======= Sort By Name =======");
		Collections.sort(emplist, new NameComparator());
		printList(emplist);
		
		// Binary search requires the list to be sorted using the same comparator
		int index = Collections.binarySearch(emplist, new Employee(349, "Janeye", 10000, Set.of()), new NameComparator());
		if(index >= 0) {
			System.out.println("Data found at index: " + index);
		} else {
			System.out.println("Data not found");
		}
		
		System.out.println("======= Sort by Salary =======");
		Collections.sort(emplist, new SalaryComparator());
		printList(emplist);
		
		index = Collections.binarySearch(emplist, new Employee(345, "Jane Smith", 110000, Set.of()), new SalaryComparator());
		if(index >= 0) {
			System.out.println("Data found at index: " + index);
		} else {
			System.out.println("Data not found");
		}
	}
}