package sorting.logical;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
//		String s="hello hi bye";
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		int sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				sp++;
			}
		}
		String[] arr=new String[sp+1];
		int k=0;
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				arr[k]=s2;
				s2="";
				k++;
			}
			else {
				s2=s2+ch;
			}

		}
		arr[k]=s2;
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
