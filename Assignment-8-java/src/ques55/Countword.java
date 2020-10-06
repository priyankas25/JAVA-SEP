package ques55;

import java.util.Scanner;

public class Countword {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s = sc.next();
		int l = s.length();
		System.out.println("number of words in string is : "+l);
	}
}
