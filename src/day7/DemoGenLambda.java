package day7;
import day6.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DemoGenLambda {
	
	// 2. HIGHER-ORDER METHOD (Generic & Static):
	// - Takes a Function and a List of type '<T>' as parameters.
	// - Applies the behavior (lambda) to each item and returns a new modified list.
	public static <T> List<T> mapData(Function<T> func, List<T> data){
		List<T> mapped = new ArrayList<T>();
		for(T item: data) {
			mapped.add(func.apply(item)); // Executes the lambda logic on each item
		}
		return mapped;
	}
	
	public static void main(String[] args) {
		
		// 3. LAMBDA EXPRESSION FOR STRINGS:
		// - Shorthand implementation of the Function interface for type String.
		Function<String> upper = (s) -> s.toUpperCase();
		System.out.println(upper.apply("hello")); // Output: HELLO
		
		// 4. LAMBDA EXPRESSION FOR INTEGERS:
		Function<Integer> square = (n) -> n*n;
		System.out.println(square.apply(5)); // Output: 25
		
		// 5. PASSING LAMBDA TO A HIGHER-ORDER METHOD (Integer List):
		List<Integer> ilist = List.of(12,13,14);
		List<Integer> squares = DemoGenLambda.mapData((n) -> n*n, ilist);
		System.out.println(squares);
		
		// 6. PASSING LAMBDA TO A HIGHER-ORDER METHOD (String List):
		List<String> slist = List.of("Hi", "Rohit", "Happy", "Birthday");
		List<String> upperCase= DemoGenLambda.mapData((s) -> s.toUpperCase(), slist);
		System.out.println(upperCase);
		
		// 7. MULTI-STATEMENT LAMBDA (Custom Object - Employee):
		// - When a lambda needs multiple statements, use curly braces { } and explicit 'return'.
		List<Employee> emplist = List.of(
			new Employee(334,"aaa",90000, Set.of("Java", "Python")), 
			new Employee(335,"aaAb",90000, Set.of("Java", "Python"))
		);
		
		List<Employee> newlist = DemoGenLambda.mapData((e)-> {
			e.setSalary(e.getSalary() + 5000); // Modify state
			return e;                          // Return modified object
		}, emplist);
		
		System.out.println(newlist);
	}
}