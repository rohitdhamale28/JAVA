// DemoLambda.java

package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class DemoLambda {

    // Passing a functional interface as an argument
    public static boolean operatorOnNumber(IPredicate p, int n) {
        return p.test(n);
    }

    // Lambda can be passed as a parameter
    public static List<Integer> filterData(IPredicate p, List<Integer> nums) {
        List<Integer> filtered = new ArrayList<Integer>();

        for (Integer n : nums) {
            if (p.test(n)) {
                filtered.add(n);
            }
        }

        return filtered;
    }

    // Normal method → later used as Method Reference
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Lambda → implementation of Functional Interface
        IPredicate even = (n) -> n % 2 == 0;

        // Calling lambda through interface method
        System.out.println(even.test(12));


        // Passing lambda directly as method argument
        boolean result = operatorOnNumber((n) -> n > 10, 20);
        System.out.println(result);


        List<Integer> lst =
                List.of(13, 23, 45, 55, 15, 67, 77, 80, 90);


        // Lambda with filter method
        List<Integer> odd =
                filterData((n) -> n % 2 == 1, lst);

        System.out.println(odd);


        // Passing an existing lambda variable
        List<Integer> evennos =
                filterData(even, lst);

        System.out.println(evennos);


        // Multi-statement Lambda → use { }
        List<Integer> primes = filterData((n) -> {

            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }

            return true;

        }, lst);

        System.out.println(primes);


        // Method Reference → ClassName::methodName
        primes = filterData(DemoLambda::isPrime, lst);

        System.out.println(primes);
    }
}