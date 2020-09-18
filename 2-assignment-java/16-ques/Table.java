import java.util.*;
class Table {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int t = sc.nextInt();
		for(int i=1; i<=10;i++){
			int T = t*i;
			System.out.println(T);
		}
		
	}
}