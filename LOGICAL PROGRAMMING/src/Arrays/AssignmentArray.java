package Arrays;

import java.util.Scanner;
public class AssignmentArray {
	static int Even (int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
	static int Prime (int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=0;
			for(int j=2;j<n;j++)
			{
			   if(n%j==0)
				  {
					  c++;
				  }
			}
			if(c==0)
			{
				  sum=sum+n;
			}
		}
		return sum;
	}
	static int Fib(int[] a)
	{
		int x,y,z,sum=0;
		for(int i=0;i<a.length;i++)
		{
		 x=0;
		 y=1;
	    while(x<=Max(a))
		{
			if(x==a[i])
			{
				sum=sum+a[i];
				break;
			}
			z=x+y;
			x=y;
			y=z;
		}
	    }
		return sum;
	}
	static int Max(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max ;
	}
	static int Square(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=a[i]/2;j++)
			{
				if(j*j==a[i])
		        {
				  sum=sum+a[i];
			    }
	        }
		}
		return sum;
	}
    public static void main(String[] args) {
	int n,ch;
	Scanner ip = new Scanner(System.in);
	System.out.println("enter the size of array");
	n=ip.nextInt();
	int a[] = new int[n];
	System.out.println("enter "+n+" elements into array");
	for(int i=0;i<n;i++)
		a[i]=ip.nextInt();
	System.out.println("===================================================================================");
	System.out.print(" 1.Sum of even Elements \n 2.Sum of prime elements \n 3.Sum of Fibonacci num\n 4.Sum of perfect Square \n 5.Greatest of Array elements\n");
	System.out.println("===================================================================================");
	System.out.println("Enter ur choice");
	ch=ip.nextInt();
	switch(ch)
	{
	case 1 : System.out.println("Sum of even numbers in array is "+Even(a));
	         break;
	case 2 : System.out.println("Sum of Prime numbers in array is "+Prime(a));
             break;
	case 3 : System.out.println("Sum of Fib numbers in array is "+Fib(a));
             break;
	case 4 : System.out.println("Sum of Perfect squares in array is "+Square(a));
             break;
	case 5 : System.out.println("Greatest number in array is "+Max(a));
	         break;
	default : System.out.println("invalid choice");
	}
	ip.close();
}

}
