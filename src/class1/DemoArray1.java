package class1;

public class DemoArray1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		for(int i= 0; i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Date [] darr = new Date[2];
		darr[0] = new Date();
		darr[1] = new Date();
		darr[0].newDate(1,"Jan",2023);
		darr[1].newDate(1,"Jan",2023);
		
		
		
//		 Date []darr1= {
//				 new Date(2,"jan",2025),
//				 new Date(2,"jan",2025),
//				 new Date(2,"jan",2025)
//		 };
		
//		for(Date i: darr) {
//			i.displayDate();
//		}
		
		
		
		
		int [][] narr= {{1,2},{1,2},{1,2},{1,2}};
		
		for(int[]row :narr) {
			for(int col : row)
				System.out.println(col);
			
		}
	}
}
