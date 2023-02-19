package Test.com;

public class SumEvenDigit {
	public static void main(String[] args) {
		int n=1242141984;
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			n=n/10;
		if(rem%2==0) {
			sum=sum+rem;
		}
	}
		System.out.println(sum);
}
}