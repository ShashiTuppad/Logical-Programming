import java.util.Scanner;
public class primenum {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Please Enter the number");
		long num=ip.nextLong();
		int c=0;
		for(long i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
			if(c==2) {
				System.out.println(num+" is a 'PRIME' number");
			}
			else {
				System.out.println(num+" is not a 'PRIME' number");
			}
		}

}

