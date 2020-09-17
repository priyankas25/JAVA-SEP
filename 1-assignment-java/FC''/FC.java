import java.util.*;
class FC{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Fahrenheit");
		float f = sc.nextFloat();
		float C = 5*(f-32)/9;
		System.out.println("Temparature in C' - "+C);
	}
}