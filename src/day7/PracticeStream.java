package day7;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PracticeStream {


	public static void main(String[] args) {
		List<String> list = List.of("Red","Yellow","orange","green","Blue","indigo","Violet");
		
		
		// 1. 
		List<String> colors_U = list.stream().map((n) -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(colors_U);
		
		List<String> colors_L = list.stream().map((n) -> n.toLowerCase()).collect(Collectors.toList());
		System.out.println(colors_L);
		
		
		// 2.
		
		List<String> filter_color_asc = colors_L.stream()
												.filter(x -> x.charAt(0) < 'm')
												.sorted()
												.collect(Collectors.toList());	
		
		
		
		
		
		List<String> filter_color_desc = colors_L.stream().filter(x -> x.charAt(0) < 'm').sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
                                                                                         //      (a,b)->(b-a)     for numeric
		System.out.println(filter_color_asc);
		System.out.println(filter_color_desc);
		
		
		
		// 3. 
		List<String> filter_color_less5_asc = colors_L.stream().filter(x -> x.length() < 5).sorted().collect(Collectors.toList());		
		List<String> filter_color_less5_desc = colors_L.stream().filter(x -> x.length() < 5).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());

		System.out.println(filter_color_less5_asc);
		System.out.println(filter_color_less5_desc);
		
		
	}
}