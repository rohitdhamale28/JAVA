package day7;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
	public static void main(String[] args) {
		int[] arr = {12, 4, 5, 23, 8, 96, 33, 67, 89, 11,7, 10, 23, 8, 96, 33};
		IntStream stream = Arrays.stream(arr);
		
		long count = stream.distinct().count();
		System.out.println("Total unique ele: "+ count);
		
		stream = Arrays.stream(arr);
		stream.distinct().sorted().forEach(System.out::println);
		
		stream = Arrays.stream(arr);
		List<Integer> filtered = stream.filter((n) -> n>15).boxed().collect(Collectors.toList());
		System.out.println(filtered);
		
		stream = Arrays.stream(arr);
		Set<Integer> squares = stream.map((n) -> n*n).boxed().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(squares);

		
		stream = Arrays.stream(arr);
		OptionalInt min = stream.min();
		min.ifPresent(System.out::println);
		
		stream = Arrays.stream(arr);
		OptionalInt max = stream.max();
		max.ifPresent(System.out::println);
		
		stream = Arrays.stream(arr);
		OptionalDouble ave = stream.average();
		ave.ifPresent(System.out::println);
		
	}
}
