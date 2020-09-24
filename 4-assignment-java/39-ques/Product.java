import java.util.*;
class Product{
	private int pid;
	private double price;
	private int quentity;
	public static int p;
	public static double m=0;
	
	Product(int p,double pr,int q){
		pid = p;
		price = pr;
		quentity = q;
	}
	
	Product(){
		
	}
	
	void set(){
		System.out.println("Enter the pid");
		Scanner sc = new Scanner(System.in);
		pid = sc.nextInt();
		System.out.println("Enter the price");
		price = sc.nextDouble();
		System.out.println("Enter quentity");
		quentity = sc.nextInt();
		if(m<price){
			m=price;
			p = pid;
		}
	}
	
	
	 public static double producttotal(Product arr[]){
		 double pri=0;
		 for(Product a : arr){
			 pri += (a.price)*(a.quentity);
		 }
		 
		 return pri;
	 }
	
}

class productDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
		for(int i=0;i<5;i++){
			arr[i] = new Product();
		}
		for(int i=0;i<5;i++){
			System.out.println("Enter the elements");
			arr[i].set();
		}
		System.out.println("total amount "+Product.producttotal(arr));
		
		System.out.println("pid of highest price "+Product.p);
		
	}
}