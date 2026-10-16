package day5;

public class DemoString {
    public static void main(String[] args) {
        
        // Literals: stored in String Constant Pool
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);      // true (same pool reference)
        System.out.println(s1.equals(s2)); // true (same value)

        // 'new' keyword: stored in normal Heap memory
        String n1 = new String("hello");
        String n2 = new String("hello");
        System.out.println(n1 == n2);      // false (different heap objects)
        System.out.println(n1.equals(n2)); // true (same value)
        
        // intern(): fetches reference from Constant Pool
        String s3 = n1.intern();
        System.out.println(s1 == s3);      // true (both point to Constant Pool)
        System.out.println(n1 == s3);      // false (Heap vs. Constant Pool)
        
        String s = "Hello World";

        s.length();                  // Returns the total number of characters
        s.charAt(0);                 // Returns the character at the given index ('H')
        s.substring(6);              // Returns a new string from index 6 to the end ("World")
        s.indexOf("o");              // Returns the index of the first occurrence of 'o' (4)
        s.equals("hello world");     // Compares content for exact equality (case-sensitive)
        s.equalsIgnoreCase("HELLO"); // Compares content ignoring case differences
        s.toLowerCase();             // Converts all characters to lowercase ("hello world")
        s.toUpperCase();             // Converts all characters to uppercase ("HELLO WORLD")
        s.trim();                    // Removes leading and trailing whitespaces
        s.replace('l', 'p');         // Replaces all 'l' characters with 'p'
        s.contains("World");         // Checks if the substring exists (returns true/false)
        s.startsWith("He");          // Checks if the string starts with the given prefix
        s.endsWith("ld");            // Checks if the string ends with the given suffix
        s.isEmpty();                 // Returns true if the string length is 0
        s.split(" ");                // Splits the string into an array based on a delimiter
        String.valueOf(123);         // Static method to convert other types (like int) to a String
    }
}

