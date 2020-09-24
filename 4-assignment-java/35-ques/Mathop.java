class Mathop{
	
	public static void add(int a,int b){
		System.out.println((a+b)+" is the sum");
	}
	
	public static void substract(int a,int b){
		System.out.println((a-b)+" is the subtraction");
	}
	
	public static void multiplication(int a,int b){
		System.out.println((a*b)+" is the multiplication");
	}
	
	public static void power(int a,int b){
		int c=1;
		for(int i=0;i<b;i++){
			c *= a;
		}
		System.out.println(c+" is the power of "+a);
	}
}

class MathDemo{
	public static void main(String args[]){
		Mathop m = new Mathop();
		m.add(3,4);
		m.substract(4,5);
		m.multiplication(2,3);
		m.power(6,2);
	}
}