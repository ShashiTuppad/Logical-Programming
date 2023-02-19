import java.util.Scanner;
public class Practies1EvenOdd {
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("please enter the number ");
		int n=ip.nextInt();
		if((n&1)==0) {
			System.out.println("The number is even");
			
		}
		else {
			System.out.println("the num is odd");
		}
	}

}
