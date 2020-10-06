package ques57;

import java.util.Scanner;

public class Reverseeach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		//for(int i=0;i<arr.length;i++) {
		//	System.out.print(" "+arr[i]);
		//}
		
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
			sb = sb.reverse();
			arr[i] = sb.toString();
			sb.setLength(0);
		}
			
			//System.out.print(a);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
