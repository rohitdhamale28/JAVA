package day4;

public interface Serializable {
	void serialize();
	
	default void test()
	{
		System.out.println("In Serializable");
	}

}