import java.util.Scanner;
public class onetonsum {

		public static void main(String[] args) 
		{
			Scanner ip=new Scanner(System.in);
			System.out.println("Please Enter the number");
			int num=ip.nextInt();
			int sum=0;
			for(int i=1;i<=num;i++) 
			{
				sum=sum+i;
			}
			System.out.println(sum);


		}
	}
