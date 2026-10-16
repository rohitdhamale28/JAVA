package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Uses IFunction interface that has int apply(int n) method.

public class DemoLambdaIFunction {

	// operate individually on each numbers. 
	// Takes a Functional Interface and List of integers as input.
	// for each number call the interface method 'apply' to process lambda function 'n*n*n' on it.
	
	public static void operateOnNumbers(IFunction func, List<Integer> numbers) {
		for (int num : numbers) {
			System.out.println(func.apply(num));
		}
	}
	
	// operate individually on each numbers but store it in the list. 
	// Takes a Functional Interface and List of integers as input.
	// for each number call the interface method 'apply' to process lambda function 'n*n*n' on it and add it to the return list.
	// return the list
	public static List<Integer> filterData(IFunction p, List<Integer> nums) {
		List<Integer> filtered = new ArrayList<Integer>();
		for (Integer n : nums) {
			int a=p.apply(n);
			filtered.add(a);
			
		}
		return filtered;
	}

	public static int cube(int n) {
		return n*n*n;
	}
	
	
	
// Write Lambda functions here on main:

	public static void main(String[] args) {

		// 1. Calculate square of a number
		IFunction square = (n) -> (n * n);
		System.out.println("Square of 7: " + square.apply(7)); // one line function application
	
		
		// 2. Calculate Factorial of a number
		IFunction factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		System.out.println("Factorial of 5: " + factorial.apply(5)); // one line function application

		
		// Question 3
		List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 12, 25);

		// 3a. Print nearest even number (if number is even return the same)
		System.out.println("\n--- 3a. Nearest Even Numbers ---");
		
		IFunction nearestEven = n -> (n % 2 == 0) ? n : n + 1; // Return the next nearest number if odd else the same number
		operateOnNumbers(nearestEven, numbers); // applies the lambda function on every numbers of list.

		// 3b. Cubes of all numbers in the list
		System.out.println("\n--- 3b. Cubes of Numbers ---");
		
		IFunction cube = n -> n * n * n; 
		operateOnNumbers(cube, numbers); //this will print cubes individually
		
		//using method by reference
		List <Integer> cubes = filterData(DemoLambdaIFunction::cube, numbers);
		System.out.println(cubes); // this will return a list of cubes of given list.

	}
}
