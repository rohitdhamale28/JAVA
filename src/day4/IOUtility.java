package day4;

public class IOUtility {
	public static void writeToData(Serializable obj)
	{
		obj.serialize();
	}
	
	public static void printData(Printable obj)
	{
		obj.print();
	}

}
