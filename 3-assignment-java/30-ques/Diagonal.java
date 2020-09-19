import java.util.*;
class Diagonal {
	public static void main(String args[]){
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the values for 3x3 array");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = sc.nextInt();
				if(i==j){
					sum += arr[i][j];
				}
			}
		}
		
		System.out.println("sum of diagonal fields is "+sum);
		
	}
}