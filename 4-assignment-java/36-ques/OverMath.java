class MathOperation{
	void multiplication(int a,int b){
		int c = a*b;
		System.out.println("multiplication of int is "+c);
	}
	
	void multiplication(float a,float b){
		float c = a*b;
		System.out.println("multiplication of float is "+c);
	}
	
	void multiplication(int arr[]){
		int c=1;
		for(int a : arr){
			c *= a;
		}
		System.out.println("multiplication of array is "+c);
	}
	
	void multiplication(double a,int b){
		double c = a*b;
		System.out.println("multiplication of float is "+c);
	}
}

class MathDemo{
	public static void main(String args[]){
		MathOperation m = new MathOperation();
		m.multiplication(4,5);
		m.multiplication(4.7f, 5.3f);
		int arr[] = new int[]{1,2,3,4,5};
		m.multiplication(arr);
		m.multiplication(5.5,5);
	}
}