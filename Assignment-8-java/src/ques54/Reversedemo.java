package ques54;

import java.util.*;

public class Reversedemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println("Reverse string is : "+sb);
	}

}
