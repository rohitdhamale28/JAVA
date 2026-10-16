package day4;

public interface Printable {
	void print();
	
	
	default void test()
	{
		System.out.println("In Printable");
	}
	

}