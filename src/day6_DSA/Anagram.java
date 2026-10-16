package day6_DSA;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.*;

public class Anagram {

	 private String s1;
	 private String s2;
	 
	 public Anagram(String s1, String s2) {
		 this.s1=s1;
		 this.s2=s2;
	 }
	
	public boolean isAnagram(){

	     char[] a=s1.toLowerCase().toCharArray();
	     char[] b=s2.toLowerCase().toCharArray();
	     Arrays.sort(a);
	     Arrays.sort(b);
	     
	     return Arrays.equals(a, b);
		
	    
	}
	
	

	
	    public static void main(String[] args) {
	    	
	    	
	     
	        Anagram s= new Anagram("Listen","Silent");
	        boolean a =s.isAnagram();
	        
	        if (a) {
	            System.out.println("Its an Anagram");
	        } else {
	            System.out.println("Its not an Anagram");
	        }
	    }
	
}
