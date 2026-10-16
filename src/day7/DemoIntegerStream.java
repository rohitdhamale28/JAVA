package day7;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
	public static void main(String[] args) {
		List<Integer> list = List.of(34,66,55,65,84,99,75);
		Stream<Integer> stream = list.stream();
		
		// 1. MAP & COLLECT: Multiply each number by 10 and pack back into a List
		List<Integer> nums = stream.map((n) -> n*10).collect(Collectors.toList());
		System.out.println(nums);
		
		// 2. REDUCE: Combines elements into a single result. 
		// Note: '10' is the identity (starting value), so it adds 10 + sum of all elements.
		stream = list.parallelStream();
		int total = stream.reduce(10, (n1,n2) -> n1+n2);
		System.out.println(total);
		
		// 3. FIND FIRST: Returns the first element in the stream (wrapped in Optional)
		stream = list.parallelStream();
		Optional<Integer> first = stream.findFirst();
		first.ifPresent(System.out::println);
		
		// 4. FIND ANY: Returns *any* element. Great for parallel streams where 
		// finding the absolute first element is less important than speed.
		stream = list.parallelStream();
		Optional<Integer> any= stream.findAny();
		any.ifPresent(System.out::println);
		
		// 5. ANY MATCH: Returns true if *at least one* element matches the condition
		stream = list.parallelStream();
		boolean match = stream.anyMatch(DemoLambda::isPrime);
		System.out.println(match);

		// 6. ALL MATCH: Returns true only if *all* elements match the condition
		stream = list.parallelStream();
		boolean matches = stream.allMatch(DemoLambda::isPrime);
		System.out.println(matches);
		
		// 7. MIN: Finds the smallest element using a Comparator
		stream = list.parallelStream();
		Optional<Integer> min = stream.min(Integer::compareTo);
		min.ifPresent(System.out::println);
		
		// 8. MAX: Finds the largest element using a Comparator
		stream = list.parallelStream();
		Optional<Integer> max = stream.max(Integer::compareTo);//(a,b)->a-b
		max.ifPresent(System.out::println);
		
		// 9. AVERAGE: Maps to a primitive Double stream to calculate the average
		stream = list.parallelStream();
		OptionalDouble ave = stream.mapToDouble(Double::valueOf).average();
		ave.ifPresent(System.out::println);
		
		// 10. FLATMAP (Nested Streams):
		List<List<Integer>> nested = List.of(List.of(1,2), List.of(2,3), List.of(3,4));
		
		// NOTE ON YOUR ORIGINAL CODE: 
		// - 'forEach' is a terminal operation that returns 'void'. You cannot assign it to 'nstream'.
		// - Passing 'null' into forEach will throw a NullPointerException.
		// CORRECTED VERSION BELOW:
		
		nested.stream()
		      .flatMap((l) -> l.stream()) // Flattens List<List<Integer>> into a single Stream<Integer>
		      .distinct()                   // Removes duplicate elements (leaves 1, 2, 3, 4)
		      .forEach(System.out::println);// Terminal operation to print each item
	}
}