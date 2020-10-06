package ques59;

import java.io.IOException;

class Voter{
	int voterid;
	String name;
	int age;
	
	Voter(){};
	
	Voter(int v,String n, int a){
		
		voterid = v;
		name = n;
		if(a>18) {
			age = a;
		}
		else {
			try {
				throw new IOException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("invalid age of voter "+e);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Voter [voterid=" + voterid + ", name=" + name + ", age=" + age + "]";
	}
}

public class Voterdemo {

	public static void main(String[] args) {
		Voter v = new Voter(10,"rakesh",17);
		System.out.println(v);
	}

}
