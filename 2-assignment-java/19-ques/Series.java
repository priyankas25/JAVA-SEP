import java.util.*;
class Series{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of values to be printed");
		int t = sc.nextInt();
		int a=2;
		for(int i=1; i<=t;i++){
			int S = a+(i-1)*10;
			System.out.println(S);
		}
		
	}
}