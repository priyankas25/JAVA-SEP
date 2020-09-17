/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]*/

class Datatype{
	public static void main(String args[]){
		int x = 10;
		int y = 20;
		int z = 30;
		
		y = x*2 + 3*x - 7;
		System.out.println("A.value of y = "+y);
		y = 20;
		y = x++ + ++x;
		System.out.println("B.value of x = "+x+ "value of y ="+y);
		x = 10;
		y = 20;
		z = 30;
		z = x++ - --y - --x  +  x++;
		System.out.println("B.value of x = "+x+ "value of y ="+y+ "value of z = "+z);
	}
}

class Data{
	public static void main(String args[]){
		boolean x = true;
		boolean y = false;
		boolean z = x && y || !(x || y);
		System.out.println("A.value of z = "+z);
	}
}