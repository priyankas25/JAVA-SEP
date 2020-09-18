import java.util.*;
class Reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int t = sc.nextInt();
		int rev = 0;
		while(t > 0){
			int y = t%10;
			t = t/10;
			rev = (rev*10)+y;
		}
		System.out.println("rev no is : "+rev);
	}
}