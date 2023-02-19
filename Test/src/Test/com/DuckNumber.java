package Test.com;

public class DuckNumber {
public static void main(String[] args) {
	boolean flag=false;
	int n=222222;
	int rem=0;
	while(n!=0) {
		rem=n%10;
		if(rem==0) {
			flag=true;
			break;
		}
		n=n/10;
	}
	if(flag==true) {
		System.out.println("DUCK");
	}
	else {
		System.out.println("not DUCK");
	}
	
}
}
