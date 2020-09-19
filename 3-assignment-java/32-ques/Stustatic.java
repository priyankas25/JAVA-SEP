class Student{
	private int rno;
	private String name;
	public static int count=0;
	
	public void setdata(int r,String n){
		rno = r;
		name = n;
		count++;
	}
	
	public void showdata(){
		System.out.println("student id: "+rno+" student name : "+name+ " no of object : "+count);
	}
}

class Demostudent{
	
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setdata(11,"priyanka");
		s1.showdata();
		
		Student s2 = new Student();
		s2.setdata(12,"prem");
		s2.showdata();
		
		Student s3 = new Student();
		s3.setdata(13,"ajay");
		s3.showdata();
	}
}