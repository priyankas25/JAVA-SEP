package ques53;

public class Parseintdemo {
		public static void main(String args[]) {
			String s = "67,89,23,67,12,55,66";
			int sum=0;
			String is[] = s.split(",");
			for(int i=0;i<is.length;i++) {
				int j = Integer.parseInt(is[i]);
				System.out.println(j);
				sum+=j;
				}
			System.out.println("sum of number is "+sum);
		}
}
