package ques58;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		
		String arr[] = {"sunday","monday","tuesday","wednesday","thursday","friday","satueday","sunday"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		try {
		int i = sc.nextInt();
		System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: "+e);
		}
	}

}
