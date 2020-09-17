import java.util.*;
class Days{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the days");
		int day = sc.nextInt();
		int year = day/365;
		day = day%365;
		int month = day/30;
		day = day%30;
		
		System.out.println("year = "+year+ "month = "+month+ "days = "+day);
	}
}