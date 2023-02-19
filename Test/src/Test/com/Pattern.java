package Test.com;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==3 || i==5) {
					System.out.print(i+" ");
				}
				else {
					System.out.print((char)(i+64)+" ");
				}
			}
			System.out.println();
		}
	}

}
