class Faculty{
	int facultyid;
	int salary;
	
	void input(int f){
		facultyid = f;
	}
	
	void Printsalary(){
		System.out.println("salary of "+facultyid+" is "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicsalary;
	int allowance;
	
	void input(int f,int b, int a){
		super.input(f);
		basicsalary = b;
		allowance = a;
		salary = basicsalary + allowance;
	}
	
	
} 

class PartTimeFaculty extends Faculty{
	int workingHours;
	int ratePerHour;
	
	void input(int f,int b, int a){
		super.input(f);
		workingHours = b;
		ratePerHour = a;
		salary = workingHours*ratePerHour;
	}
	
	
} 

class FacultyDemo{
	public static void main(String args[]){
		FullTimeFaculty f1 = new FullTimeFaculty();
		PartTimeFaculty p1 = new PartTimeFaculty();
		
		f1.input(02,20000,5000);
		p1.input(01,5,2000);
		
		f1.Printsalary();
		p1.Printsalary();
	}
}