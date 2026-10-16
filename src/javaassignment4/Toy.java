package javaassignment4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import class1.Date;
import day9.Employee;

public class Toy {
	private int product_id;
	private String name;
	private double price;
	private String category;
	private String age; 
	private int purachase_month;
	private int year;
	
	
	
	public Toy(int product_id, String name, double price, String category, String age, int purachase_month, int year) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.age = age;
		this.purachase_month = purachase_month;
		this.year = year;
	}

	

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getPurachase_month() {
		return purachase_month;
	}

	public void setPurachase_month(int purachase_month) {
		this.purachase_month = purachase_month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Toy [product_id=" + product_id + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", age=" + age + ", purachase_month=" + purachase_month + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		List<Toy> stock = new ArrayList<Toy> ();
		stock.add(new Toy(1,"Bat",800,"sports","5+",5,2016));
		stock.add(new Toy(1,"Ball",6000,"sports","5+",12,2026));
		stock.add(new Toy(1,"Football",6000,"sports","2+",30,2023));
		stock.add(new Toy(1,"Gun",6000,"boys","15+",15,2022));
		stock.add(new Toy(1,"Barbie",400,"girls","10+",6,2025));
		stock.add(new Toy(1,"PS5",900,"video games","15+",9,2026));
		
		// 1. List all the stocks
		stock.stream().forEach(System.out::println);
		
		// 2. Filter the stock by category [e.g. Educational / Battery operated etc]
		
		stock.stream()
	     .filter(x -> "sports".equals(x.getCategory()))
	     .forEach(e -> System.out.println(e)); 

//		//OR
		
		stock.stream()
	     .filter((e) -> e.getCategory().contains("sports"))
	     .forEach(e -> System.out.println(e)); 
		
		
		
		
//		3. List Toys by price range (e.g. between 500 to 1000)
		
		stock.stream()
	     .filter(x -> (x.getPrice()>=500 & x.getPrice()<=1000))
	     .forEach(e -> System.out.println(e)); 
//		
//		4. Sort the toys by price- category wise
		
		stock.stream().sorted(Comparator.comparing(Toy::getPrice)
                .thenComparing(Toy::getCategory))
				.forEach(System.out::println);
		
		
//		5. Make the list of old stock [older than 1 year]
		int currYear = Year.now().getValue();
		
		stock.stream().filter(x->x.getYear()<currYear).forEach(System.out::println);
		

		
		//6. Make a group of toys as per their category, count them
		
	    System.out.println(stock.stream().collect(Collectors.groupingBy(Toy::getCategory,Collectors.counting())));
		


		//	7. Display the most expensive/least expensive toy in given category
	  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Category: ");
	    String category1 = sc.next();
	    stock.stream().filter(a-> category1.equals(a.getCategory())).max(Comparator.comparing(Toy::getPrice)).ifPresent(System.out::println);
    
	    
	    
	    //	8. Print total no of toys in stock for each age grp
	    Map<String, Long> ageStockCount = stock.stream().collect(Collectors.groupingBy(Toy::getAge, Collectors.counting()));

	    ageStockCount.forEach((k, v) -> System.out.println(k + ": " + v));	}

	
	
}
