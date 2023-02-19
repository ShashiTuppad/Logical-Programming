package Test.com;
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n1=ip.nextInt();
		int n2=n1;
		int n3=n1;
		int c=0;
		while(n1!=0) {
			c++;
			n1=n1/10;
		}
		int sum=0;int rem=0;
		while(n2!=0) {
			
		rem=n2%10;
		int pow=1;
		for(int i=1;i<=c;i++) {
			pow=pow*rem;
		}
			sum=sum+pow;
			n2=n2/10;
			
		}
		if(n3==sum) {
			System.out.println("Armstrong");
		}
		else{
			System.out.println("not a armstrong");
		}
	}

}
