package day6_DSA;

import java.util.Arrays;

public class count_char {

//	Q. Count no. of uppercase/lowercase/special char in a string 
	private String s1;

	public count_char(String s1) {
		this.s1 = s1;
	}

	public void count_chars() {
//	     Arrays.sort(a);

		int lower = 0;
		int upper = 0;
		int specialC = 0;
		for (char ch : s1.toCharArray()) {

//			System.out.println(ch); // 'ch' holds the actual character

			if (ch >= 65 && ch <= 90)
				upper++;
			else if (ch >= 97 && ch <= 122)
				lower++;
			else
				specialC++;
		}
	
		System.out.println("Lower Charaters: " + lower);
		System.out.println("Upper Charaters: " + upper);
		System.out.println("Special Charaters: " + specialC);

	}

	public static void main(String[] args) {
		count_char s = new count_char("This is a String, Lets count uppercase, lowercase and special characters.");
		s.count_chars();
	}

}
