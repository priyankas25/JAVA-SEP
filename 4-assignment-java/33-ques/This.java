class Employee{
	private int empid;
	private String empname;
	
	void set(int empid,String empname){
		this.empid = empid;
		this.empname = empname;
	}
	void show(){
		System.out.println(empid+" "+empname);
}

}

class manager extends Employee{
	private int ta;
	private int da;
	
	void set(int empid, String name, int ta,int da){
		set(empid, name);
		this.ta = ta;
		this.da = da;
	}
	void show(){
		super.show();
		System.out.println(ta+" "+da);
	}
}

class managerDemo{
	public static void main(String args[]){
		manager m = new manager();
		m.set(1,"hari",5,6);
		m.show();
		
	}
}