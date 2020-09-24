interface Taxable{
	int salesTax = 7;
	float incomeTax = 10.5f;
	
 void calcTax();
}

class Employee implements Taxable{
	int empId;
	String name;
	int salary;
	
	Employee(){}
	
	Employee(int eid, String n, int sal){
		this.empId = eid;
		this.name = n;
		this.salary = sal;
	}
	
	public void calcTax(){
		double incomeTax1 = incomeTax*salary;
		System.out.println("Tax-->"+incomeTax1);
	}
}

class Product implements Taxable{
	int Pid;
	int price;
	int quantity;
	
	Product(){}
	
	Product(int Pid, int p, int q){
		this.Pid = Pid;
		this.price = p;
		this.quantity = q;
	}
	
	public void calcTax(){
		double salesTax1 = salesTax*price*quantity;
		System.out.println("Tax-->"+salesTax1);
	}
}

class A49
{
	public static void main(String[] args){
		Taxable e = new Employee(001,"Rohan",20000);
		Taxable p = new Product(001,250,5);
		e.calcTax();
		p.calcTax();
	}
}