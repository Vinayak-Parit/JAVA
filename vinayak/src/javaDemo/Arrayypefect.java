package javaDemo;
import java.util.Scanner;
public class Arrayypefect {
	public static void main(String args[])
	{
		int size,i,j,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sze of array");
		size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements.....");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("perfect elements from array");
		for(i=0;i<size;i++)
		{
			sum=0;
			for(j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==a[i])
			{
				System.out.print(a[i] +"\t");
			}
		}
		
	}

}
