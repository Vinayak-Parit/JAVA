package javaDemo;
import java.util.Scanner;
public class ArrayPrime {
	
	public static void main(String arg[])
	{
		int size,i,j,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the array size....\n");
		size=sc.nextInt();

		int a[]=new int[size];
		System.out.println("\nAdd array element....");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Prime are:\n");
		for(i=1;i<size;i++)
		{
			count = 0;
			for(j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
	
				System.out.print(a[i]+" \t");
			}
		}
	}

}
