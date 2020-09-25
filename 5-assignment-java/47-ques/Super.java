class person{
		person(){
		System.out.println("no arg person");
		}
		
		person(int a){
		System.out.println("1 arg person");
		}
			
}

class Employee extends person{
		Employee(){
		super();	
		System.out.println("no arg Employess");
		}
		
		Employee(int a){
			super(4);
			System.out.println("1 arg Employess");
		}
}


class EmployeeDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		Employee e1 = new Employee(2);
	}
}