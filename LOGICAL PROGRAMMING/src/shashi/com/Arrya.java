package shashi.com;

public class Arrya {
public static void main(String[] args) {
	int[] arr= {1,4,6,2,3,4,2};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);
}
}
