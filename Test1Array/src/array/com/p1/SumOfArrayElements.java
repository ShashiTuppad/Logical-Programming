package array.com.p1;
import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = ip.nextInt();
		
		// array of size
		int arr[]= new int[size];  // creates an array of given size with default values
		
		// getting array elements from user
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter th element at "+i+" index position : ");
			arr[i] = ip.nextInt();
		}
		
		System.out.println("==============================================");
		// array elements sum
		int sum =0;
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum of array elements is :"+sum);
		
		
		System.out.println("=================================================");
		System.out.println("Performing sum of even elements");
		// Sum of even Elements in a array
		int sum2 =0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum2 = sum2+arr[i];
			}
		}
		System.out.println("Sum of even  array elements is :"+sum2);
		System.out.println("=================================================");
		
		// Sum of prime elements in a array
		System.out.println("Performing prime elements sum");
		int sum3 = 0; 
		for( int i =0; i<arr.length; i++)
		{
			int count=0;
			for(int j =1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum3 = sum3+arr[i];
			}
		}
		System.out.println("Sum of prime elements is "+sum3);
		
	}
}

