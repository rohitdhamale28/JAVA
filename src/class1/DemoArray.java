package class1;

public class DemoArray {
	 public static void main(String[] args) {
		 
// Array :
		 int arr[]= {1,2,3};
		 for(int i :arr) {
			 System.out.println(i);
		 }
		 
//		 initializing an empty array
		 int arr1[]= new int[3];
		 arr1[0]=1;
		 
// Array of objects : 
//		 this array only stores references not the original onject 
//		 hence the array should be created using 'new' , before adding its reference to the object array
//		 darr[0]= Date(2,"jan",2025) , directly assigning gives error as , array stores reference not value 
	
//		 Date []darr= new Date[5];
//		 Date d1=new Date(2,"jan",2025);
//		 Date d2=new Date(2,"jan",2025);
//		 Date d3=new Date(2,"jan",2025);
//		 
//		 darr[0]=d1;
//		 darr[1]=d2;
//		 darr[2]=d3;
//		 OR 
		 Date []darr1= {
				 new Date(2,"jan",2025),
				 new Date(2,"jan",2025),
				 new Date(2,"jan",2025)
		 };
		 
		 
	 }
}
