package ques51;

import java.util.Scanner;

class Bank{
	long accno;
	String name;
	double balance;
	String branch;
	String acctype;
	
	Scanner sc = new Scanner(System.in);
	
	void input() {
		
		System.out.println("choose your account Type");
		System.out.println("1) saving 2) current");
		int s = sc.nextInt();
		
		switch(s) {
		
		case 1:
			acctype = "current";
			System.out.println("Enter your name");
			name = sc.next();
			
			System.out.println("Enter branch");
			branch = sc.next();
			
			System.out.println("Enter balance");
			System.out.println("saving account opening balance and minimum balance must be 5000.");
			balance = sc.nextDouble();
			while(balance < 5000) {
				System.out.println("saving account opening balance and minimum balance must be 5000.");
				System.out.println("Enter balance");
				balance = sc.nextDouble();
				
			}
			accno++;
			System.out.println(this);
			break;
			
		case 2:
			acctype = "saving";
			System.out.println("Enter your name");
			name = sc.next();
			
			System.out.println("Enter branch");
			branch = sc.next();
			
			System.out.println("Enter balance");
			System.out.println("current account opening balance and minimum balance must be 1000");
			balance = sc.nextDouble();
			while(balance < 1000) {
				System.out.println("current account opening balance and minimum balance must be 1000");
				System.out.println("Enter balance");
				balance = sc.nextDouble();
				
			}
			accno++;
		}
		}
	
	void Deposit() {
		
		System.out.println("Enter amount");
		Double bal = sc.nextDouble();
		balance+=bal;
		System.out.println("total balance : "+balance);
	}
	
	void Withdrawal(){
		System.out.println("Enter amount");
		Double bal = sc.nextDouble();
		if(this.acctype =="saving") {
			if((balance-bal)<5000) {
				System.out.println("you dont have enough credit in your account");
			}
			else {
				balance -= bal; 
				System.out.println("money withdrown : "+bal);
				System.out.println("balance left "+balance);
			}
		}
		
		if(this.acctype =="current") {
			if((balance-bal)<1000) {
				System.out.println("you dont have enough credit in your account");
			}
			else {
				balance -= bal; 
				System.out.println("money withdrown : "+bal);
				System.out.println("balance left "+balance);
			}
		}
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+" Account number "+accno+" Branch "+branch+" account type "+acctype+" Balance "+balance;
	}
}

public class BankDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank arr[] = new Bank[10];
		int i = 0;
		outer:
		while(true) {
			System.out.println("Wellcome to Bank Of India");
			System.out.println("choose your option");
			System.out.println("1) create an account  2) show account details  3) Deposit  4) withdrawal  5)exit");
			int q = sc.nextInt();
			switch(q) {
			
			case 1:
				arr[i]=new Bank();
				arr[i].input();
				break;
				
			case 2:
				System.out.println("enter your name and account number");
				String nam = sc.next();
				int aw = sc.nextInt();
				for(int j=0;j<=i;j++) {
					if(aw == arr[j].accno) {
						System.out.println(arr[j]);
						break;
					}
					if(j>i) {
						System.out.println("user is not registered");
					}	
				}
				break;
				
			case 3:
				System.out.println("enter your name and account number");
				String n = sc.next();
				int aa = sc.nextInt();
				for(int j=0;j<=i;j++) {
					if(aa == arr[j].accno) {
						arr[j].Deposit();
						break;
					}
					if(j>i) {
						System.out.println("user is not registered");
					}	
				}
				break;
				
			case 4:
				System.out.println("enter your name and account number");
				String na = sc.next();
				int aq = sc.nextInt();
				for(int j=0;j<=i;j++) {
					if(aq == arr[j].accno) {
						arr[j].Withdrawal();
						break;
					}
					if(j>i) {
						System.out.println("user is not registered");
					}	
				}
				break;
				
			case 5:
				break outer;
			}
			
			i++;
		}
		System.out.println("while loop broken");
	}

}
