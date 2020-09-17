import java.util.*;
class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		int r = sc.nextInt();
		double A = (3.14*r*r);
		double C = 2*(3.14)*r;
		System.out.println("area is "+A+"circumference is"+C);
	}
}