package sorting.logical;

public class Recursive {
	static int j=1;
	static void col(int m) {
		if(m>0) {
			
			col(m-1);
			System.out.print(m+" ");
		}
	}
	static void row(int n) {
		if(n>0) {
			col(5);
			j++;
			System.out.println();
			row(n-1);
			
		}
	}
	public static void main(String[] args) {
		row(5);
	}

}
