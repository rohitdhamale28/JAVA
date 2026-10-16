package day9;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Employee implements Comparable<Employee> {
    private int empid;
    private String name;
    public String department;
    private double salary;
    private Set<String> skills;

    // Constructor to include department
    public Employee(int empid, String name, String department, double salary, Set<String> skills) {
        super();
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + ", salary=" + salary + ", skills=" + skills + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, name, department, salary, skills);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return empid == other.empid && 
               Double.compare(other.salary, salary) == 0 && 
               Objects.equals(name, other.name) && 
               Objects.equals(department, other.department) && 
               Objects.equals(skills, other.skills);
    }
    
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empid, o.empid);
    }
    
    public static void main(String[] args) {
        List<Employee> emplist = EmployeeStream.initializeData();
        
        System.out.println("----Add/Remove/Update----");
        emplist.add(new Employee(678, "aaa", "IT", 50000, Set.of("Java", "C++", "C")));
        emplist.removeIf((emp) -> emp.getEmpid() == 343);
        
        Stream<Employee> stream = emplist.stream();
        stream.filter((emp) -> emp.getEmpid() == 678)
              .findFirst()
              .ifPresent((emp) -> {
                  emp.setName("abcd");
                  System.out.println("Updated: " + emp);
              });
        
        System.out.println("\n----All Employees----");
        emplist.stream().forEach(System.out::println);
        
        System.out.println("\n----Filter by skills----");
        Predicate<Employee> byskills = (e) -> e.getSkills().contains("Java");
        emplist.stream().filter(byskills).forEach(System.out::println);
        
        System.out.println("\n----Group by department----");
        Map<String, List<Employee>> deptmap = emplist.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        deptmap.forEach((k, v) -> System.out.println(k + " -- " + v));
        
        System.out.println("\n----Total spending by dept----");
        Map<String, Double> totalSal = emplist.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        totalSal.forEach((k, v) -> System.out.println(k + " -- " + v));
        
        System.out.println("\n----Sort by Department then Name----");
        emplist.stream()
               .sorted(Comparator.comparing(Employee::getDepartment)
                                 .thenComparing(Employee::getName))
               .forEach(System.out::println);
        
        System.out.println("\n----Min Salary----");
        emplist.stream()
               .min(Comparator.comparing(Employee::getSalary))
               .ifPresent(System.out::println);
        
        System.out.println("\n----Max Salary----");
        emplist.stream()
               .max(Comparator.comparing(Employee::getSalary))
               .ifPresent(System.out::println);
        
        System.out.println("\n----Average Salary----");
        stream = emplist.stream();
        
               
//        System.out.println("Average Salary: " + avgSalary);
    }
}