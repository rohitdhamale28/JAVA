package day3_oct1;

public class PayrollService {

	public static void main(String[] args) {
		SalariedEmployee se = new SalariedEmployee(12123, "aaa", 700000);
		ContractEmployee ce = new ContractEmployee(12123, "aaa", 80, 800);
		
		payRoll.displayGross(se); // employee for compiler, salaried employee for runtime
		payRoll.displayGross(ce);
		
//		UP-CASTING: sub class object converted into superclass type
		Employee ese = new SalariedEmployee(12123, "aaa", 700000); 
		payRoll.displayGross(ese);

		
		Manager me = new Manager(453654, "ccc", 1000000, 10000);
		
		Employee [] employees = new Employee[3];
		employees[0] = ese;
		employees[1] = ce;
		employees[2] = me;

		for(Employee e: employees) {
			payRoll.displayGross(e);
		}
		
//		DOWN-CASTING to see the specific methods of child class
		SalariedEmployee sse = (SalariedEmployee)ese;
		System.out.println("Net Salary "+ sse.calculateNet());
	}

}
