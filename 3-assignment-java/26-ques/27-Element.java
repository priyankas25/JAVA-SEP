class Element{
	public static void main(String args[]){
		int arr[][] = new int[5][];
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,10,11};
		int d[] = {12,13,14};
		int e[] = {15,16,19};
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		
		int sum =0;
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
				sum += arr[i][j];
			}
			System.out.println("");
		}
		System.out.println("sum is : "+sum);
	}
}