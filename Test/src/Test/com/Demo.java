package Test.com;

import java.util.Scanner;

public class Demo{
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int n1=n;
		int  sum=0;
		int rem=1;
		while(n!=0) {
			rem=n%10;
			int ans=factorial(rem);
			sum=sum+ans;
			n=n/10;	
		}
		if(n1==sum) {
			System.out.println("strong num");
		}
		else {
			System.out.println("not a strong number");
		}
	}
	
}
