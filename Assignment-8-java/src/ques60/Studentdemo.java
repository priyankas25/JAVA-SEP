package ques60;

import java.lang.Exception;
import java.util.Scanner;

class InvalidFee extends Exception{
	InvalidFee(){
		super("invalid fee");
	}
}

interface Studentfee {
	void getfee(double f);
}

class Studentdemo implements Studentfee {
	String name;
	double fee;
	
	public static void getfee(double f) throws InvalidFee {
		if(f>500) {
			fee = f;
			System.out.println("fee = "+fee);
		}else {
			throw new InvalidFee();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("enter your fee");
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		try {
			getfee(f);
		}catch(InvalidFee e){
			System.out.println(e);
		}
	}
}



