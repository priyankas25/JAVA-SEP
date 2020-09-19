class Student{
	private int rno;
	private String name;
	
	public void setdata(int r,String n){
		rno = r;
		name = n;
	}
	
	public void showdata(){
		System.out.println("student id: "+rno+"student name : "+name);
	}
}

class Demostudent{
	
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setdata(11,"priyanka");
		s1.showdata();
	}
}