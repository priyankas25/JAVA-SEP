class Hello{
	public static int a=1;
	
	public static void am(){
		System.out.println("static method");
		//return 2;
	}
}

class Hellodemo{
	 public static void main(String[] args){
		int b = Hello.a;
		System.out.println(b);
		Hello.am();
	}
}