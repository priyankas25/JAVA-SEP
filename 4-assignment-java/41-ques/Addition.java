public class Addition{
	private int a;
	private int b;
	public Addition(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int add(){
		int c;
		c = a+b;
		return c;
	}
	public static void main(String[] args){
		Addition a1 = new Addition(3,4);
		System.out.println("addition of 2 number is :" +a1.add());
	}
}