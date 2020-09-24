import java.util.*;
class Student{
	private int rollno;
	private String name;
	private int age;
	private double score;
	
	
	void set(){
		System.out.println("Enter the roll number");
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter the score");
		score = sc.nextDouble();
		
	}
	public static void scoregrooup(Student arr[]){
		
		String a[] =new String[3];
		for(Student a : arr){
			if(a.score<=50){
				System.out.println("-------0-50------");
				System.out.println(a.name);
			}
			
			else if(a.score>50 && a.score<=65){
				System.out.println("-------50-65------");
				System.out.println(a.name);
			}
			
			else if(a.score>65 && a.score<=80){
				System.out.println("-------65-80------");
				System.out.println(a.name);
			}
			
			else if(a.score>80 && a.score<=100){
				System.out.println("------80-100------");
				System.out.println(a.name);
			}
		}
	}
	
}

class StudentDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[10];
		for(int i=0;i<10;i++){
			arr[i] = new Student();
		}
		for(int i=0;i<10;i++){
			System.out.println("Enter the elements");
			arr[i].set();
		}
		
		Student.scoregrooup(arr);
	}
}