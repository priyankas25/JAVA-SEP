class Employee{
	private static int empno;
	private double salary;
	private static double totalsalary;
	
	Employee(double salary){
		this.salary = salary;
		totalsalary += salary;
		empno++;
	}
	
	void show(){
		System.out.println("total no of employees are "+empno+" total salary is "+totalsalary);
		
	}
	
}

class EmpDemo {
	public static void main(String args[]){
		Employee e = new Employee(20000);
		Employee e1 = new Employee(20000);
		Employee e2 = new Employee(10000);
		Employee e3 = new Employee(15000);
		Employee e4 = new Employee(30000);
		e4.show();
	}
}