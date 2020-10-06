package ques50;

import java.util.Scanner;

class Employee{
	int empid;
	String Empname;
	double salary;
	
	Employee(int e, String name,double s) {
		//super();
		this.empid = e;
		this.Empname = name;
		this.salary = s;
	}
	public Employee() {}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id");
		this.empid = sc.nextInt();
		System.out.println("enter name");
		this.Empname = sc.next();
		System.out.println("enter salary");
		this.salary = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return empid+" "+Empname+" "+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		
		return e.empid == empid ;
	}
}

class EmployeeDemo {

	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		
		for(int i=0;i<5;i++) {
			arr[i] = new Employee();
		}
		
		for(int i=0;i<5;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student id");
			arr[i].empid = sc.nextInt();
			if(i>0) {
				for(int j=0;j<i;j++) {
					if(arr[i].equals(arr[j])){
						System.out.println("ID already exists!!!!");
						//continue outer;
						//break outer;
						System.out.println("enter student id");
						arr[i].empid = sc.nextInt();
					}
				}
			}
			
			
			System.out.println("enter name");
			arr[i].Empname = sc.next();
			System.out.println("enter salary");
			arr[i].salary = sc.nextDouble();
		}
		
		for(Employee a :arr) {
			System.out.println(a);
		}

	}

}
