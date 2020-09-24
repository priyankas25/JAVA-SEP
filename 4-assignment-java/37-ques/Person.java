class Person{
	private int age;
	private String name;
	
	public Person(){
		age = 18;
		name = "";
	}
	
	void set(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	
	void show(){
		
		System.out.println("age of person is "+age+ "name is "+name);
	}
}

class PersonDemo{
	public static void main(String args[]){
		Person m = new Person();
		m.set(20,"akash");
		m.show();
		Person m1 = new Person();
		m1.show();
	}
}