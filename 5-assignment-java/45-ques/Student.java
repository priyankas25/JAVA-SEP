class Student{
	int rollno;
	double percentage;
	
	Student(){}
	
	Student(int r,double p){
		rollno = r;
		percentage = p;
	}
	
	void show(){
		System.out.println("roll number- "+rollno+" percentage is- "+percentage);
	}
}

class CollegeStudent extends Student{
	int semester;
	
	CollegeStudent(){}
	
	CollegeStudent(int r,double p, int s){
		super(r,p);
		semester = s;
	}
	
	void show(){
		super.show();
		System.out.println("semester is- "+semester);
	}
}

class SchoolStudent extends Student{
	int className;
	
	SchoolStudent(){}
	
	SchoolStudent(int r,double p, int s){
		super(r,p);
		className = s;
	}
	
	void show(){
		super.show();
		System.out.println("class Name is- "+className);
	}
}

class Demo{
	public static void main(String args[]){
		CollegeStudent f1 = new CollegeStudent(11,65.6,4);
		SchoolStudent p1 = new SchoolStudent(22,78.0,12);
		
		f1.show();
		p1.show();
		
	}
}