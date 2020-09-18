import java.util.*;
class Sort {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int arr[] = new int[10];
		for(int i=0; i<10;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int a=0;a<10;a++){
			for(int b=a+1;b<10;b++){
				if(arr[a]<arr[b]){
					int temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		for(int i=0; i<10;i++){
			System.out.print(arr[i]);
		}
	}
}