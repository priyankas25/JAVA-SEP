import java.util.*;
class Reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int arr[] = new int[10];
		for(int i=0; i<10;i++){
			arr[i] = sc.nextInt();
		}
		int l = arr.length;
		for(int a=0;a<=l/2;a++){
				int temp = arr[a];
				arr[a]=arr[l-a-1];
				arr[l-a-1] = temp;
			}
		for(int i=0; i<10;i++){
			System.out.print(arr[i]+" ");
		}
	}
}