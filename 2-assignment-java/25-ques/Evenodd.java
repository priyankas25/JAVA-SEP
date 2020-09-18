import java.util.*;
class Evenodd {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int arr[] = new int[10];
		for(int i=0; i<10;i++){
			arr[i] = sc.nextInt();
		}
		int es=0;
		int os=0;
		
		for(int i=0; i<10;i++){
				if(arr[i]%2 == 0){
					es+=arr[i];
				}
				else {
					os+=arr[i];
				}
		}
		
		System.out.println("sum of even no is : "+es+" sum of odd no is : "+os);
	}
}