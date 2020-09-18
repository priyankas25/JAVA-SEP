import java.util.*;
class Aelement {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int arr[] = new int[10];
		int sum=0;
		double avg;
		for(int i=0; i<10;i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		avg = sum/10.0;
		System.out.print("sum of array element is : "+sum+"average of array element is : "+avg);
	}
}