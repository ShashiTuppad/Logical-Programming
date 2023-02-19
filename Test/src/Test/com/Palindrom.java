package Test.com;
import java.util.Scanner;
public class Palindrom {
public static void main(String[] args) {
	int sum=0;
	int rem=0;
	Scanner ip=new Scanner(System.in);
	int n=ip.nextInt();int n1=n;
	while(n!=0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(n1==sum) {
		System.out.println("palindrom");
	}
	else {
		System.out.println("not a palindrom");
	}
	}
}
