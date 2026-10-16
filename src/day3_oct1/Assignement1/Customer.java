package day3_oct1.Assignement1;

public class Customer {
		protected int id;
		protected String name;
		
		protected static int count = 0;
		
		public Customer(String name) {
			this.id = ++count;
			this.name = name;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + "]";
		}
}
