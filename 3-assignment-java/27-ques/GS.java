import java.util.*;
class Arrnew{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[]{2,5,6,7,6};
		int max=ar[0];
		int min=ar[0];
		for(int a=1;a<ar.length;a++){
			if(max<ar[a]){
				max = ar[a];
			}
			if(min>ar[a]){
				min = ar[a];
			}
			
		}
		System.out.print(max+ " is max element " +min+" is the min element");
	}
}