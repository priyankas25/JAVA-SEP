import java.util.*;
class Arrnew {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int count2d=0;
		int count1d=0;
		
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
				
			}
		}	
		
		for(int i=0;i<arr.length;i++){
			count2d++;
			
			count1d = arr[i].length;
			System.out.println("length of"+i+" is "+count1d);
	}
	System.out.println("variable in 2d array are "+count2d);
}
}