import java.util.*;
class Eligible{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name,gender and age");
		String name = sc.next();
		String g = sc.next();
		int age = sc.nextInt();
		if(age > 21){
			System.out.println(name+" you are eligible for marriage");
		}
		else {
			System.out.println(name+" you are not eligible for marriage");
		}
	}
}
