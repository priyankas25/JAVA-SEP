import java.util.*;
class Table {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range for prime number to be printed");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int j=0;
		for(int i=a; i<=b;i++){
			for(j=2; j<i;j++){
				if(i%j == 0){
					break;
				}
			}
			if(j==i){
					System.out.println(i);
				}
			
		}
		
	}
}