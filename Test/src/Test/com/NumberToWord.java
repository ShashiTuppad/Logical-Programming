package Test.com;

public class NumberToWord {

	public static void main(String[] args) {
		String[] arr= {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		
		int n=456;
		String ans="";
		int rem=0;
		while(n!=0) {
			rem=n%10;
			ans=arr[rem]+ans;
			n=n/10;
		}
		System.out.println(ans);

	}

}
