package ques52;

public class Voweldemo {

	public static void main(String[] args) {
		String s = "hii how are you!";
		int countv = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				countv++;
			}
		}
			System.out.println("number of vowels in string are "+countv);
	}

}
