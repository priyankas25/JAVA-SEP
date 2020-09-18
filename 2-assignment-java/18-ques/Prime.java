import java.util.*;
class Prime {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int t = sc.nextInt();
		int i;
		for(i=2;i<=t;i++){
			if(t%i==0){
				break;
			}
		}
		if(i==t){
			System.out.println("number is prime");
		}
		else{
			System.out.println("number is not prime");
		}
	}
}