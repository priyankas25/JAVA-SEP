import java.util.*;
class Greater{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 nunbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String g = (a>b ? a>c ? a+" is greater": c+" is greater" : b>c ? b+" is greater" : c+" is greater" );
		System.out.println(g);
	}
}