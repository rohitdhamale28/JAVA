package day7;

// 1. GENERIC FUNCTIONAL INTERFACE: 
// - Has exactly one abstract method (Single Abstract Method / SAM).
// - '<T>' makes it reusable for any data type (String, Integer, Employee, etc.).
public interface Function<T>{
	T apply(T data);
}