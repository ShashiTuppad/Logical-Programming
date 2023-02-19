package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class testcase11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=-5;
		int n=sc.nextInt();
		int a=1;
		System.out.print(num);
		for (int i = 1; i < n; i++) {
			num=num+a;
			System.out.print(","+num);
			a++;
		}
	}

}
