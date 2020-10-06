package ques56;

import java.util.Scanner;

public class Firstletter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a string");
		
		//String s = sc.next();
		
		String s = "hi how are you";
		String arr[] = s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String a = arr[i].substring(0,1);
			String b = arr[i].substring(1);
			a = a.toUpperCase();
			arr[i] = a.concat(b); 
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
