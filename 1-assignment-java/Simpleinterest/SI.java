import java.util.*;
class SI {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount,rate and time");
		double amount = sc.nextInt();
		double rate = sc.nextInt();
		double time = sc.nextInt();
		double si = (amount+time+rate)/100.0;
		System.out.println("simple interest is = "+si);
	}
}