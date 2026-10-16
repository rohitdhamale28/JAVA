// IPredicate.java

package day7;

@FunctionalInterface
public interface IPredicate {

    // Single abstract method → Functional Interface
    boolean test(int n);
}