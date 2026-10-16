package class1;

public class NewDate {
    public static void main(String[] args) {
        // 1. Using the default constructor (which chains to this(1, "Jan", 2026))
    	
        Date defaultDate = new Date();
        System.out.print("Default Date: ");
        defaultDate.displayDate();

        
        // 2. Using the parameterized constructor
        
        Date customDate = new Date(15, "August", 2026);
        System.out.print("Custom Date (Parameterized Constructor): ");
        customDate.displayDate();

        
        // 3. Using the newDate() method to update values using 'this' reference
        
        customDate.newDate(26, "January", 2027);
        System.out.print("Updated Date (using newDate method): ");
        customDate.displayDate();

        
        // 4. Using Setters and Getters with validation
        
        customDate.setDay(10); // Valid day
        System.out.println("Get Day only: " + customDate.getDay());

        
        // 5. Using the toString() method directly in print statement
        
        System.out.println("Using toString(): " + customDate);
    }
}