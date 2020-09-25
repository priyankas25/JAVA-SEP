class person{
		void getdetail(){
		System.out.println("person details");
		}
		
		void getjob(){
		System.out.println("person job");
		}
			
}

class Employee extends person{
		void getjob(){
		//super();	
		System.out.println("Employee job");
		}
		
		void getdept(){
			//super(4);
			System.out.println("Employee dept");
		}
}


class EmployeeDemo{
	public static void main(String args[]){
		Employee e1 = new Employee();
		person p = new Employee();//upcasting--
		//e1.getdetail();
		//e1.getjob();
		//e1.getdept();
		//-----------
		Employee e2 = (Employee)p; //downcasting--
		e2.getdetail();
		e2.getjob();
		e2.getdept();
		
		person ar[] = {new Employee(),new person()};
		for(person a : ar){
			Employee e = (Employee)a;
			e.getdept();
		}
		
		for(person b : ar){
			if(b instanceof Employee){
				Employee e = (Employee)b;
				e.getdept();
			}
		}
	}
}