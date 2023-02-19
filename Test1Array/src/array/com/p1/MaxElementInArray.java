package array.com.p1;

import java.util.Scanner;
public class MaxElementInArray
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
		
		//checking for maximum elements
		System.out.println("finding the Max element ");
		int maxElement = 0;
		for(int i =0; i<arr.length;i++)
		{
			 maxElement =arr[i];
			if(arr[i]>maxElement)
			{
				maxElement = arr[i];
			}
		}
		
		System.out.println("maximun element is: "+maxElement);

	}
}
