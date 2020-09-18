import java.util.*;
class Search {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int arr[] = new int[10];
		for(int i=0; i<10;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("enter element you want to search");
		int a = sc.nextInt();
		
		for(int i=0; i<10;i++){
			if(arr[i] == a){
				System.out.print("element is at "+i+"th index");
				break;
			}
		}
		
	}
}