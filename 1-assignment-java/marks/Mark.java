import java.util.*;
class Mark{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		double percent = ((double)(a+b+c+d+e)/500.0) *100;
		System.out.println("percentage marks are = "+percent+"%");
	}
}