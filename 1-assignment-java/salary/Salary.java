import java.util.*;
class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary");
		int sa = sc.nextInt();
		if(sa < 10000){
			double hra = sa*0.10;
			double da = sa*0.90;
		double total = sa+hra+da;
		System.out.println("less salary total= "+total);
		}
		else {
			double hra = 2000;
			double da = sa*0.98;
		double total = sa+hra+da;
		System.out.println("salary total= "+total);
		}
	}
}