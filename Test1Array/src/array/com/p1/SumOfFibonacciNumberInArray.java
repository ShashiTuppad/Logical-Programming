package array.com.p1;

import java.util.Scanner;
public class SumOfFibonacciNumberInArray
{	
	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter size of aray ");
		int size = ip.nextInt();

		int arr[] = new int[size]; //creates array of given size with default values

		System.out.println("Enter array elements");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = ip.nextInt();
		}

		System.out.println("=========================");
		// check if the array elements are in fiboacci series are not
		
		int sum2 =0;
		for(int i = 0; i<arr.length; i++)
		{
			int sum =0, n1=0, n2=1;

			while(sum<=arr[i])
			{
				if(arr[i]==n1)
				{
					break;
				}
				sum = n1+n2;
				n1=n2;
				n2=sum;
			}
			
			if(arr[i]==n1)
			{
				sum2 = sum2+arr[i];
			}
		}
		
		System.out.println("sum of array elements in fibonacci series are: "+sum2);
		System.out.println("===========================");
	}
}
