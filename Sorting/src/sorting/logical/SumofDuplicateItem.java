package sorting.logical;

import java.util.Scanner;

public class SumofDuplicateItem {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[] arr=new int[size];
//		int size1=ip.nextInt();
		int[] arr1=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			int value=ip.nextInt();
			arr[i]=value;
			arr1[i]=value;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					c++;
					arr1[j]=0;
					
				}
			}
			if(c>1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
